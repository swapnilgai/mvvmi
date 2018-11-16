package java.com.mvvm_i.di.Component

import android.app.Application
import dagger.Component
import java.com.mvvm_i.di.Module.AppModule
import java.com.mvvm_i.di.Module.NetworkModule
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, AppModule::class])
interface AppComponent {
  fun inject(app: Application)

  fun getFragmentComponent(): FragmentComponent

}