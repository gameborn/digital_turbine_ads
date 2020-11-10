package com.digitalturbine.dtproductlist.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00142\u0006\u0010\u001a\u001a\u00020\u001bJ\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00142\u0006\u0010\u001e\u001a\u00020\u001bJ \u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H 0\u0014\"\u0004\b\u0000\u0010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H 0\u0014J\u000e\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006$"}, d2 = {"Lcom/digitalturbine/dtproductlist/api/Repository;", "", "()V", "disposableRequests", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "isAuthorized", "", "mainDatabase", "Lcom/digitalturbine/dtproductlist/db/MainDatabase;", "getMainDatabase", "()Lcom/digitalturbine/dtproductlist/db/MainDatabase;", "setMainDatabase", "(Lcom/digitalturbine/dtproductlist/db/MainDatabase;)V", "webAPI", "Lcom/digitalturbine/dtproductlist/di/WebAPI;", "getWebAPI", "()Lcom/digitalturbine/dtproductlist/di/WebAPI;", "setWebAPI", "(Lcom/digitalturbine/dtproductlist/di/WebAPI;)V", "authorize", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/digitalturbine/dtproductlist/data/auth/AuthorizationData;", "disposeAll", "", "loadAdByCampaignId", "Lcom/digitalturbine/dtproductlist/data/ads/AdData;", "campaignId", "", "loadAds", "Lcom/digitalturbine/dtproductlist/data/ads/AdsRoot;", "totalCampaigns", "makeRequest", "T", "request", "setAuthorized", "value", "app_debug"})
public final class Repository {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.digitalturbine.dtproductlist.di.WebAPI webAPI;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.digitalturbine.dtproductlist.db.MainDatabase mainDatabase;
    private io.reactivex.rxjava3.disposables.CompositeDisposable disposableRequests;
    private boolean isAuthorized = false;
    
    @org.jetbrains.annotations.NotNull()
    public final com.digitalturbine.dtproductlist.di.WebAPI getWebAPI() {
        return null;
    }
    
    public final void setWebAPI(@org.jetbrains.annotations.NotNull()
    com.digitalturbine.dtproductlist.di.WebAPI p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.digitalturbine.dtproductlist.db.MainDatabase getMainDatabase() {
        return null;
    }
    
    public final void setMainDatabase(@org.jetbrains.annotations.NotNull()
    com.digitalturbine.dtproductlist.db.MainDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Observable<com.digitalturbine.dtproductlist.data.auth.AuthorizationData> authorize() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Observable<com.digitalturbine.dtproductlist.data.ads.AdsRoot> loadAds(@org.jetbrains.annotations.NotNull()
    java.lang.String totalCampaigns) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Observable<com.digitalturbine.dtproductlist.data.ads.AdData> loadAdByCampaignId(@org.jetbrains.annotations.NotNull()
    java.lang.String campaignId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.rxjava3.core.Observable<T> makeRequest(@org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.core.Observable<T> request) {
        return null;
    }
    
    public final void disposeAll() {
    }
    
    public final void setAuthorized(boolean value) {
    }
    
    public final boolean isAuthorized() {
        return false;
    }
    
    @javax.inject.Inject()
    public Repository() {
        super();
    }
}