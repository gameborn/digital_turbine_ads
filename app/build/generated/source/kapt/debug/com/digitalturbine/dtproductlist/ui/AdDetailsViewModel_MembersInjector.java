package com.digitalturbine.dtproductlist.ui;

import com.digitalturbine.dtproductlist.api.Repository;
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
public final class AdDetailsViewModel_MembersInjector implements MembersInjector<AdDetailsViewModel> {
  private final Provider<Repository> repositoryProvider;

  public AdDetailsViewModel_MembersInjector(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<AdDetailsViewModel> create(
      Provider<Repository> repositoryProvider) {
    return new AdDetailsViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(AdDetailsViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("com.digitalturbine.dtproductlist.ui.AdDetailsViewModel.repository")
  public static void injectRepository(AdDetailsViewModel instance, Repository repository) {
    instance.repository = repository;
  }
}
