package java.com.mvvm_i

import android.app.Application
import java.com.mvvm_i.di.Component.AppComponent
import java.com.mvvm_i.di.Component.DaggerAppComponent
import java.com.mvvm_i.di.Component.FragmentComponent
import java.com.mvvm_i.di.Module.AppModule

class App : Application() {

  companion object {
    lateinit var appComponent: AppComponent

    lateinit var fragmentComponent: FragmentComponent
  }


  override fun onCreate() {
    super.onCreate()
    appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()

    fragmentComponent = appComponent.getFragmentComponent()

  }
}