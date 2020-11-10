package com.digitalturbine.dtproductlist.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0012H\u0002J\b\u0010#\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006$"}, d2 = {"Lcom/digitalturbine/dtproductlist/ui/AdListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adListAdapter", "Lcom/digitalturbine/dtproductlist/adapters/AdListAdapter;", "binding", "Lcom/digitalturbine/dtproductlist/databinding/AdListFragmentBinding;", "getBinding", "()Lcom/digitalturbine/dtproductlist/databinding/AdListFragmentBinding;", "setBinding", "(Lcom/digitalturbine/dtproductlist/databinding/AdListFragmentBinding;)V", "viewModel", "Lcom/digitalturbine/dtproductlist/ui/AdListViewModel;", "getViewModel", "()Lcom/digitalturbine/dtproductlist/ui/AdListViewModel;", "setViewModel", "(Lcom/digitalturbine/dtproductlist/ui/AdListViewModel;)V", "hideSoftKeyboard", "", "activity", "Landroid/app/Activity;", "initViews", "initialize", "navigateToItemDetails", "campaignId", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "subscribeLocalEvents", "subscribeUIChanges", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AdListFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.digitalturbine.dtproductlist.ui.AdListViewModel viewModel;
    private com.digitalturbine.dtproductlist.adapters.AdListAdapter adListAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.digitalturbine.dtproductlist.databinding.AdListFragmentBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.digitalturbine.dtproductlist.ui.AdListViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.digitalturbine.dtproductlist.ui.AdListViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.digitalturbine.dtproductlist.databinding.AdListFragmentBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.digitalturbine.dtproductlist.databinding.AdListFragmentBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * initialize - init all bindings and provide listeners before fragment inited
     */
    private final void initialize() {
    }
    
    /**
     * initViews - initialize all views in this fragment
     */
    private final void initViews() {
    }
    
    /**
     * subscribeLocalEvents - provide listeners to user actions
     */
    private final void subscribeLocalEvents() {
    }
    
    /**
     * subscribeUIChanges - subscribe to data changes in ViewModel which will be applied to the current fragment
     */
    private final void subscribeUIChanges() {
    }
    
    /**
     * navigateToItemDetails - navigate to AdDetailsFragment
     *
     * @param campaignId - provides by Item clicked in adListView
     */
    private final void navigateToItemDetails(java.lang.String campaignId) {
    }
    
    /**
     * hideSoftKeyboard - Hide soft keyboard
     */
    public final void hideSoftKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public AdListFragment() {
        super();
    }
}