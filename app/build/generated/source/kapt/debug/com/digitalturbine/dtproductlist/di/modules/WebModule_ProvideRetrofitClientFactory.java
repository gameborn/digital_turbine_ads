package com.digitalturbine.dtproductlist.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WebModule_ProvideRetrofitClientFactory implements Factory<Retrofit> {
  @Override
  public Retrofit get() {
    return provideRetrofitClient();
  }

  public static WebModule_ProvideRetrofitClientFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Retrofit provideRetrofitClient() {
    return Preconditions.checkNotNull(WebModule.INSTANCE.provideRetrofitClient(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final WebModule_ProvideRetrofitClientFactory INSTANCE = new WebModule_ProvideRetrofitClientFactory();
  }
}
