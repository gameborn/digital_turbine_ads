package com.digitalturbine.dtproductlist.di.modules;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.FragmentComponent.class})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/digitalturbine/dtproductlist/di/modules/WebModule;", "", "()V", "provideRetrofitClient", "Lretrofit2/Retrofit;", "provideWebAPI", "Lcom/digitalturbine/dtproductlist/di/WebAPI;", "retrofit", "app_debug"})
@dagger.Module()
public final class WebModule {
    public static final com.digitalturbine.dtproductlist.di.modules.WebModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Reusable()
    @dagger.Provides()
    public final com.digitalturbine.dtproductlist.di.WebAPI provideWebAPI(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Reusable()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofitClient() {
        return null;
    }
    
    private WebModule() {
        super();
    }
}