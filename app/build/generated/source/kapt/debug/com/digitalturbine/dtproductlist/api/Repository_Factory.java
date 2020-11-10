package com.digitalturbine.dtproductlist.api;

import com.digitalturbine.dtproductlist.db.MainDatabase;
import com.digitalturbine.dtproductlist.di.WebAPI;
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
public final class Repository_Factory implements Factory<Repository> {
  private final Provider<WebAPI> webAPIProvider;

  private final Provider<MainDatabase> mainDatabaseProvider;

  public Repository_Factory(Provider<WebAPI> webAPIProvider,
      Provider<MainDatabase> mainDatabaseProvider) {
    this.webAPIProvider = webAPIProvider;
    this.mainDatabaseProvider = mainDatabaseProvider;
  }

  @Override
  public Repository get() {
    Repository instance = newInstance();
    Repository_MembersInjector.injectWebAPI(instance, webAPIProvider.get());
    Repository_MembersInjector.injectMainDatabase(instance, mainDatabaseProvider.get());
    return instance;
  }

  public static Repository_Factory create(Provider<WebAPI> webAPIProvider,
      Provider<MainDatabase> mainDatabaseProvider) {
    return new Repository_Factory(webAPIProvider, mainDatabaseProvider);
  }

  public static Repository newInstance() {
    return new Repository();
  }
}
