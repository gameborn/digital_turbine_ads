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
public final class AdDetailsFragment_MembersInjector implements MembersInjector<AdDetailsFragment> {
  private final Provider<AdDetailsViewModel> viewModelProvider;

  public AdDetailsFragment_MembersInjector(Provider<AdDetailsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<AdDetailsFragment> create(
      Provider<AdDetailsViewModel> viewModelProvider) {
    return new AdDetailsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(AdDetailsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("com.digitalturbine.dtproductlist.ui.AdDetailsFragment.viewModel")
  public static void injectViewModel(AdDetailsFragment instance, AdDetailsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
