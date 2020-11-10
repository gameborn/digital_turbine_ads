package com.digitalturbine.dtproductlist.ui

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.digitalturbine.dtproductlist.R
import com.digitalturbine.dtproductlist.ext.DEVELOPER_LAST_NAME
import com.digitalturbine.dtproductlist.api.ParamsBuilder
import com.digitalturbine.dtproductlist.api.Repository
import com.digitalturbine.dtproductlist.api.RequestParamNames
import com.digitalturbine.dtproductlist.ext.TOTAL_CAMPAIGNS_PER_REQUEST
import com.digitalturbine.dtproductlist.data.ads.AdData
import com.digitalturbine.dtproductlist.data.auth.RecipientData
import com.digitalturbine.dtproductlist.db.MainDatabase
import com.digitalturbine.dtproductlist.di.WebAPI
import dagger.hilt.android.qualifiers.ApplicationContext
import io.reactivex.rxjava3.core.Maybe
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject
import kotlin.coroutines.coroutineContext


/**
 * AdListViewModel - view-model for AdListFragment
 *
 * @param context - provides by Hilt
 */

class AdListViewModel @Inject constructor(@ApplicationContext private val context: Context) : ViewModel() {

    @Inject
    lateinit var repository: Repository

    var adListData = MutableLiveData<MutableList<AdData>>()
    var loadAdsButtonText = MutableLiveData<String>()

    /**
     * Initial call to authorize application with backend side and get authorization parameters for further calls
     * for this particular case I make fake request and set hardcoded params to make other request work
     */
    fun authorize()
    {
        if(!repository.isAuthorized())
        {
            repository.authorize().subscribe (
                {
                    Log.i("MYDATA", "AUTHORIZATION COMPLETE")
                },
                {
                    Log.i("MYDATA", "AUTHORIZATION ERROR ${it.message}")
                }
            )
        }

    }

    /**
     * loadAds - load list of Ads
     *
     * @param totalCampaigns - amount of ads that will be requested
     */
    fun loadAds(totalCampaigns: String)
    {
        repository.loadAds(totalCampaigns).subscribe (
            {
                adListData.postValue(it.ads)
                loadAdsButtonText.postValue(context.getString(R.string.button_reload_ads_text))
            },
            {
                Log.i("MYDATA", "LOAD ADS ERROR ${it.message}")
            }
        )
    }

    /**
     * onCleared - dispose all requests made within current fragment when this ViewModel is no longer used and will be destroyed
     */
    override fun onCleared() {
        repository.disposeAll()
    }
}