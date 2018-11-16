package java.com.mvvm_i.di.Module

import android.content.Context
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.OkHttpClient
import dagger.Provides
import com.google.gson.GsonBuilder
import dagger.Module
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import java.com.mvvm_i.R
import java.com.mvvm_i.di.ForApplication
import java.com.mvvm_i.network.ApiAccess
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module
class NetworkModule {
  @Provides
  @Singleton
  fun provideLoggingInterceptor(): HttpLoggingInterceptor {
    val loggingInterceptor = HttpLoggingInterceptor()
    loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
    return loggingInterceptor
  }

  @Provides
  @Singleton
  fun provideHttpClient(
    httpLoggingInterceptor: HttpLoggingInterceptor)
      : OkHttpClient {
    val builder = OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor)
      .connectTimeout(10, TimeUnit.SECONDS)
      .writeTimeout(10, TimeUnit.SECONDS)
      .readTimeout(10, TimeUnit.SECONDS)
    return builder.build()
  }

  @Provides
  @Singleton
  fun provideGsonConverterFactory(): GsonConverterFactory {
    return GsonConverterFactory.create(GsonBuilder().create())
  }

  @Provides
  @Singleton
  fun provideRxJava2CallAdapterFactory(): RxJava2CallAdapterFactory {
    return RxJava2CallAdapterFactory.create()
  }

  @Provides
  @Singleton
  fun provideApiAccess(
    context: Context,
    httpClient: OkHttpClient, gsonConverterFactory: GsonConverterFactory,
    rxJava2CallAdapterFactory: RxJava2CallAdapterFactory
  ): ApiAccess {
    val retrofit = Retrofit.Builder().baseUrl(context.getString(R.string.url))
      .addConverterFactory(gsonConverterFactory)
      .addCallAdapterFactory(rxJava2CallAdapterFactory)
      .client(httpClient)
      .client(httpClient)
      .build()
    return retrofit.create(ApiAccess::class.java)
  }
}