package com.digitalturbine.dtproductlist.ui;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AdListFragment_MembersInjector implements MembersInjector<AdListFragment> {
  private final Provider<AdListViewModel> viewModelProvider;

  public AdListFragment_MembersInjector(Provider<AdListViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<AdListFragment> create(
      Provider<AdListViewModel> viewModelProvider) {
    return new AdListFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(AdListFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("com.digitalturbine.dtproductlist.ui.AdListFragment.viewModel")
  public static void injectViewModel(AdListFragment instance, AdListViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
