package com.digitalturbine.dtproductlist.ui;

import java.lang.System;

/**
 * AdDetailsFragment - selected ad details
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eR\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lcom/digitalturbine/dtproductlist/ui/AdDetailsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Lcom/digitalturbine/dtproductlist/ui/AdDetailsFragmentArgs;", "getArgs", "()Lcom/digitalturbine/dtproductlist/ui/AdDetailsFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lcom/digitalturbine/dtproductlist/databinding/AdDetailsFragmentBinding;", "viewModel", "Lcom/digitalturbine/dtproductlist/ui/AdDetailsViewModel;", "getViewModel", "()Lcom/digitalturbine/dtproductlist/ui/AdDetailsViewModel;", "setViewModel", "(Lcom/digitalturbine/dtproductlist/ui/AdDetailsViewModel;)V", "initialize", "", "navigateBackToList", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "showAdDetails", "ad", "Lcom/digitalturbine/dtproductlist/data/ads/AdData;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AdDetailsFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.digitalturbine.dtproductlist.ui.AdDetailsViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private com.digitalturbine.dtproductlist.databinding.AdDetailsFragmentBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.digitalturbine.dtproductlist.ui.AdDetailsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.digitalturbine.dtproductlist.ui.AdDetailsViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.digitalturbine.dtproductlist.ui.AdDetailsFragmentArgs getArgs() {
        return null;
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
     * initialize - init fragment
     */
    public final void initialize() {
    }
    
    /**
     * showAdDetails - show details of selected ad
     *
     * @param ad - retrieved data from database of selected ad
     */
    public final void showAdDetails(@org.jetbrains.annotations.NotNull()
    com.digitalturbine.dtproductlist.data.ads.AdData ad) {
    }
    
    /**
     * navigateBackToList - return back to AdListFragment
     */
    public final void navigateBackToList() {
    }
    
    public AdDetailsFragment() {
        super();
    }
}