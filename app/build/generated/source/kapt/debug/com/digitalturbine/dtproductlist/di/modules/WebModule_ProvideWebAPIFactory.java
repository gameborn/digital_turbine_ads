package com.digitalturbine.dtproductlist.di.modules;

import com.digitalturbine.dtproductlist.di.WebAPI;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WebModule_ProvideWebAPIFactory implements Factory<WebAPI> {
  private final Provider<Retrofit> retrofitProvider;

  public WebModule_ProvideWebAPIFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public WebAPI get() {
    return provideWebAPI(retrofitProvider.get());
  }

  public static WebModule_ProvideWebAPIFactory create(Provider<Retrofit> retrofitProvider) {
    return new WebModule_ProvideWebAPIFactory(retrofitProvider);
  }

  public static WebAPI provideWebAPI(Retrofit retrofit) {
    return Preconditions.checkNotNull(WebModule.INSTANCE.provideWebAPI(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
