package com.digitalturbine.dtproductlist.di.modules;

import android.content.Context;
import com.digitalturbine.dtproductlist.db.MainDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DatabaseModule_ProvideDatabaseFactory implements Factory<MainDatabase> {
  private final Provider<Context> contextProvider;

  public DatabaseModule_ProvideDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public MainDatabase get() {
    return provideDatabase(contextProvider.get());
  }

  public static DatabaseModule_ProvideDatabaseFactory create(Provider<Context> contextProvider) {
    return new DatabaseModule_ProvideDatabaseFactory(contextProvider);
  }

  public static MainDatabase provideDatabase(Context context) {
    return Preconditions.checkNotNull(DatabaseModule.INSTANCE.provideDatabase(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
