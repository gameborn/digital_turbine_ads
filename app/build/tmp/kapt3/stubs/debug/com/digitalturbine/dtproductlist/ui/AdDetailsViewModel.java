package com.digitalturbine.dtproductlist.ui;

import java.lang.System;

/**
 * AdDetailsViewModel - view-model for AdDetailsFragment
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/digitalturbine/dtproductlist/ui/AdDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "currentAd", "Landroidx/lifecycle/MutableLiveData;", "Lcom/digitalturbine/dtproductlist/data/ads/AdData;", "getCurrentAd", "()Landroidx/lifecycle/MutableLiveData;", "setCurrentAd", "(Landroidx/lifecycle/MutableLiveData;)V", "repository", "Lcom/digitalturbine/dtproductlist/api/Repository;", "getRepository", "()Lcom/digitalturbine/dtproductlist/api/Repository;", "setRepository", "(Lcom/digitalturbine/dtproductlist/api/Repository;)V", "loadAdDetails", "", "campaignId", "", "app_debug"})
public final class AdDetailsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.digitalturbine.dtproductlist.api.Repository repository;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.digitalturbine.dtproductlist.data.ads.AdData> currentAd;
    
    @org.jetbrains.annotations.NotNull()
    public final com.digitalturbine.dtproductlist.api.Repository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.digitalturbine.dtproductlist.api.Repository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.digitalturbine.dtproductlist.data.ads.AdData> getCurrentAd() {
        return null;
    }
    
    public final void setCurrentAd(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.digitalturbine.dtproductlist.data.ads.AdData> p0) {
    }
    
    /**
     * loadAdDetails - load details for selected ad
     *
     * @param campaignId - identified using to find selected ad in database
     */
    public final void loadAdDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String campaignId) {
    }
    
    @javax.inject.Inject()
    public AdDetailsViewModel() {
        super();
    }
}