package com.digitalturbine.dtproductlist.di

import com.digitalturbine.dtproductlist.ext.REQUEST_AUTHORIZATION
import com.digitalturbine.dtproductlist.ext.REQUEST_GET_ADS
import com.digitalturbine.dtproductlist.data.ads.AdsRoot
import com.digitalturbine.dtproductlist.data.auth.AuthorizationData
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface WebAPI
{
    @GET(REQUEST_GET_ADS)
    fun getAds(@QueryMap params: Map<String, String>): Observable<AdsRoot>

    @GET(REQUEST_AUTHORIZATION)
    fun authorization(): Observable<AuthorizationData>
}