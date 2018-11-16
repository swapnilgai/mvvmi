package java.com.mvvm_i

import android.app.Application
import java.com.mvvm_i.di.Component.AppComponent
import java.com.mvvm_i.di.Component.DaggerAppComponent
import java.com.mvvm_i.di.Component.DaggerFragmentComponent
import java.com.mvvm_i.di.Component.FragmentComponent
import java.com.mvvm_i.di.Module.ApiAccessServiceModule
import java.com.mvvm_i.di.Module.AppModule
import java.com.mvvm_i.di.Module.FragmentModule
import java.com.mvvm_i.di.Module.NetworkModule

class App : Application() {

  companion object {
    lateinit var appComponent : AppComponent

    lateinit var fragmetComponent: FragmentComponent
  }


  override fun onCreate() {
    super.onCreate()
    appComponent  = DaggerAppComponent.builder().networkModule(NetworkModule()).appModule(AppModule(this)).build()

    fragmetComponent = DaggerFragmentComponent.builder().appComponent(appComponent).build()
  }
}