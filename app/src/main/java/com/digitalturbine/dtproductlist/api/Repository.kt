package com.digitalturbine.dtproductlist.api

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.digitalturbine.dtproductlist.data.ads.AdData
import com.digitalturbine.dtproductlist.data.ads.AdsRoot
import com.digitalturbine.dtproductlist.data.auth.AuthorizationData
import com.digitalturbine.dtproductlist.data.auth.RecipientData
import com.digitalturbine.dtproductlist.db.MainDatabase
import com.digitalturbine.dtproductlist.di.WebAPI
import com.digitalturbine.dtproductlist.ext.DEVELOPER_LAST_NAME
import com.digitalturbine.dtproductlist.ext.TOTAL_CAMPAIGNS_PER_REQUEST
import io.reactivex.rxjava3.core.Maybe
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import io.reactivex.rxjava3.subjects.PublishSubject
import javax.inject.Inject

class Repository @Inject constructor()
{
    @Inject
    lateinit var webAPI: WebAPI

    @Inject
    lateinit var mainDatabase: MainDatabase

    private var disposableRequests: CompositeDisposable = CompositeDisposable()

    private var isAuthorized = false

    fun authorize(): Observable<AuthorizationData>
    {
        val request = webAPI.authorization()
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.io())
            .doOnError{

                val data = RecipientData(
                    "236",
                    "OVUJ1DJN",
                    "10777",
                    "4230",
                    "techtestsession"
                )

                mainDatabase.recipientDataDAO().insertData(data)
                setAuthorized(true)
            }

        return makeRequest(request)
    }



    fun loadAds(totalCampaigns: String): Observable<AdsRoot>
    {
        val loadRecipientData = Observable.create<RecipientData>()
        {
            emmiter -> emmiter.onNext(mainDatabase.recipientDataDAO().load("236"))
        }
        .subscribeOn(Schedulers.io())
        .observeOn(Schedulers.io())
        .flatMap {

            val params = ParamsBuilder.Builder()
            .addRecipient(it)
            .addParam(RequestParamNames.TOTAL_CAMPAIGN_REQUESTED, totalCampaigns)
            .addParam(RequestParamNames.L_NAME, DEVELOPER_LAST_NAME)
            .build()

            webAPI.getAds(params).subscribeOn(Schedulers.io())
        }
        .observeOn(Schedulers.io())
        .map {
            adsRoot ->

            mainDatabase.adsDAO().insertAll(adsRoot.ads)

            adsRoot

        }

        return makeRequest(loadRecipientData)
    }

    fun loadAdByCampaignId(campaignId: String): Observable<AdData>
    {
        val loadAdData = Observable.create<AdData>()
        {
            emmiter -> emmiter.onNext(mainDatabase.adsDAO().load(campaignId))
        }.subscribeOn(Schedulers.io())

        return makeRequest(loadAdData)
    }

    fun <T> makeRequest(request: Observable<T>): Observable<T>
    {
        val resultData = PublishSubject.create<T>()

        val disposable = request
            .subscribeOn(Schedulers.io())
            .subscribe(
            {
                resultData.onNext(it)
            },
            {
                resultData.onError(it)
            }
        )

        disposableRequests.add(disposable)

        return resultData
    }

    fun disposeAll()
    {
        disposableRequests.dispose()
    }

    fun setAuthorized(value: Boolean){ isAuthorized = value }
    fun isAuthorized() = isAuthorized
}