package com.digitalturbine.dtproductlist.api;

import com.digitalturbine.dtproductlist.db.MainDatabase;
import com.digitalturbine.dtproductlist.di.WebAPI;
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
public final class Repository_MembersInjector implements MembersInjector<Repository> {
  private final Provider<WebAPI> webAPIProvider;

  private final Provider<MainDatabase> mainDatabaseProvider;

  public Repository_MembersInjector(Provider<WebAPI> webAPIProvider,
      Provider<MainDatabase> mainDatabaseProvider) {
    this.webAPIProvider = webAPIProvider;
    this.mainDatabaseProvider = mainDatabaseProvider;
  }

  public static MembersInjector<Repository> create(Provider<WebAPI> webAPIProvider,
      Provider<MainDatabase> mainDatabaseProvider) {
    return new Repository_MembersInjector(webAPIProvider, mainDatabaseProvider);
  }

  @Override
  public void injectMembers(Repository instance) {
    injectWebAPI(instance, webAPIProvider.get());
    injectMainDatabase(instance, mainDatabaseProvider.get());
  }

  @InjectedFieldSignature("com.digitalturbine.dtproductlist.api.Repository.webAPI")
  public static void injectWebAPI(Repository instance, WebAPI webAPI) {
    instance.webAPI = webAPI;
  }

  @InjectedFieldSignature("com.digitalturbine.dtproductlist.api.Repository.mainDatabase")
  public static void injectMainDatabase(Repository instance, MainDatabase mainDatabase) {
    instance.mainDatabase = mainDatabase;
  }
}
