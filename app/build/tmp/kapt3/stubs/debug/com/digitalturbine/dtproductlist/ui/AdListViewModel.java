package com.digitalturbine.dtproductlist.ui;

import java.lang.System;

/**
 * AdListViewModel - view-model for AdListFragment
 *
 * @param context - provides by Hilt
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000eJ\b\u0010\u001b\u001a\u00020\u0018H\u0014R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001c"}, d2 = {"Lcom/digitalturbine/dtproductlist/ui/AdListViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adListData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/digitalturbine/dtproductlist/data/ads/AdData;", "getAdListData", "()Landroidx/lifecycle/MutableLiveData;", "setAdListData", "(Landroidx/lifecycle/MutableLiveData;)V", "loadAdsButtonText", "", "getLoadAdsButtonText", "setLoadAdsButtonText", "repository", "Lcom/digitalturbine/dtproductlist/api/Repository;", "getRepository", "()Lcom/digitalturbine/dtproductlist/api/Repository;", "setRepository", "(Lcom/digitalturbine/dtproductlist/api/Repository;)V", "authorize", "", "loadAds", "totalCampaigns", "onCleared", "app_debug"})
public final class AdListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.digitalturbine.dtproductlist.api.Repository repository;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.digitalturbine.dtproductlist.data.ads.AdData>> adListData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> loadAdsButtonText;
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.digitalturbine.dtproductlist.api.Repository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.digitalturbine.dtproductlist.api.Repository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.digitalturbine.dtproductlist.data.ads.AdData>> getAdListData() {
        return null;
    }
    
    public final void setAdListData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.digitalturbine.dtproductlist.data.ads.AdData>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLoadAdsButtonText() {
        return null;
    }
    
    public final void setLoadAdsButtonText(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    /**
     * Initial call to authorize application with backend side and get authorization parameters for further calls
     * for this particular case I make fake request and set hardcoded params to make other request work
     */
    public final void authorize() {
    }
    
    /**
     * loadAds - load list of Ads
     *
     * @param totalCampaigns - amount of ads that will be requested
     */
    public final void loadAds(@org.jetbrains.annotations.NotNull()
    java.lang.String totalCampaigns) {
    }
    
    /**
     * onCleared - dispose all requests made within current fragment when this ViewModel is no longer used and will be destroyed
     */
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @javax.inject.Inject()
    public AdListViewModel(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
}