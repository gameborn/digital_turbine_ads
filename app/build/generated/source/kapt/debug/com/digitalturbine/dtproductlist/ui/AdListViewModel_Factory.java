package com.digitalturbine.dtproductlist.ui;

import android.content.Context;
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
public final class AdListViewModel_Factory implements Factory<AdListViewModel> {
  private final Provider<Context> contextProvider;

  private final Provider<Repository> repositoryProvider;

  public AdListViewModel_Factory(Provider<Context> contextProvider,
      Provider<Repository> repositoryProvider) {
    this.contextProvider = contextProvider;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public AdListViewModel get() {
    AdListViewModel instance = newInstance(contextProvider.get());
    AdListViewModel_MembersInjector.injectRepository(instance, repositoryProvider.get());
    return instance;
  }

  public static AdListViewModel_Factory create(Provider<Context> contextProvider,
      Provider<Repository> repositoryProvider) {
    return new AdListViewModel_Factory(contextProvider, repositoryProvider);
  }

  public static AdListViewModel newInstance(Context context) {
    return new AdListViewModel(context);
  }
}
