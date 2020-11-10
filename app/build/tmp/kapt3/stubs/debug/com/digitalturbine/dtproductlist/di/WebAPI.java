package com.digitalturbine.dtproductlist.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\'\u00a8\u0006\n"}, d2 = {"Lcom/digitalturbine/dtproductlist/di/WebAPI;", "", "authorization", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/digitalturbine/dtproductlist/data/auth/AuthorizationData;", "getAds", "Lcom/digitalturbine/dtproductlist/data/ads/AdsRoot;", "params", "", "", "app_debug"})
public abstract interface WebAPI {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/getAds")
    public abstract io.reactivex.rxjava3.core.Observable<com.digitalturbine.dtproductlist.data.ads.AdsRoot> getAds(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.String> params);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/authorization")
    public abstract io.reactivex.rxjava3.core.Observable<com.digitalturbine.dtproductlist.data.auth.AuthorizationData> authorization();
}