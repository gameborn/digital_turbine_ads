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
public final class AdListViewModel_MembersInjector implements MembersInjector<AdListViewModel> {
  private final Provider<Repository> repositoryProvider;

  public AdListViewModel_MembersInjector(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<AdListViewModel> create(Provider<Repository> repositoryProvider) {
    return new AdListViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(AdListViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("com.digitalturbine.dtproductlist.ui.AdListViewModel.repository")
  public static void injectRepository(AdListViewModel instance, Repository repository) {
    instance.repository = repository;
  }
}
