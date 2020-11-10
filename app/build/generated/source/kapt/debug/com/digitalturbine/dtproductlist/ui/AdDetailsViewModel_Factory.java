package com.digitalturbine.dtproductlist.ui;

import com.digitalturbine.dtproductlist.api.Repository;
import dagger.internal.Factory;
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
public final class AdDetailsViewModel_Factory implements Factory<AdDetailsViewModel> {
  private final Provider<Repository> repositoryProvider;

  public AdDetailsViewModel_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public AdDetailsViewModel get() {
    AdDetailsViewModel instance = newInstance();
    AdDetailsViewModel_MembersInjector.injectRepository(instance, repositoryProvider.get());
    return instance;
  }

  public static AdDetailsViewModel_Factory create(Provider<Repository> repositoryProvider) {
    return new AdDetailsViewModel_Factory(repositoryProvider);
  }

  public static AdDetailsViewModel newInstance() {
    return new AdDetailsViewModel();
  }
}
