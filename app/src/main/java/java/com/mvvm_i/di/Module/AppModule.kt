package java.com.mvvm_i.di.Module

import android.app.Application
import android.content.Context
import dagger.Module
import java.com.mvvm_i.di.ForApplication
import javax.inject.Singleton
import dagger.Provides




@Module
class AppModule(val application: Application) {

  @Provides
  @ForApplication
  fun provideContext(): Context {
    return application
  }
}