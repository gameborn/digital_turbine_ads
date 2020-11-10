package com.digitalturbine.dtproductlist.di.modules

import com.digitalturbine.dtproductlist.ext.BASE_URL_REQUEST_ADS
import com.digitalturbine.dtproductlist.di.WebAPI
import com.tickaroo.tikxml.TikXml
import com.tickaroo.tikxml.retrofit.TikXmlConverterFactory
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory


@Module
@InstallIn(FragmentComponent::class)
object WebModule
{
    @Provides
    @Reusable
    fun provideWebAPI(retrofit: Retrofit): WebAPI
    {
        return retrofit.create(WebAPI::class.java)
    }

    @Provides
    @Reusable
    fun provideRetrofitClient(): Retrofit
    {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        val client = OkHttpClient.Builder().addInterceptor(interceptor).build()

        val tikXml = TikXml.Builder()
            .writeDefaultXmlDeclaration(true) // or false
            .exceptionOnUnreadXml(false)
            .build()

        return Retrofit.Builder()
            .baseUrl(BASE_URL_REQUEST_ADS)
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .addConverterFactory(TikXmlConverterFactory.create(tikXml))
            .client(client)
            .build()
    }
}
