package java.com.mvvm_i.di.Component

import dagger.Component
import java.com.mvvm_i.MainActivity
import java.com.mvvm_i.MainFragment
import java.com.mvvm_i.di.ForActivity
import java.com.mvvm_i.di.ForApplication
import java.com.mvvm_i.di.Module.ApiAccessServiceModule
import java.com.mvvm_i.di.Module.FragmentModule
import java.com.mvvm_i.di.Module.NetworkModule
import javax.inject.Singleton

@ForActivity
@Component(dependencies = [AppComponent::class], modules = [FragmentModule::class, ApiAccessServiceModule::class] )
interface  FragmentComponent {
  fun inject(mainActivity: MainActivity)

  fun inject(mainFragment: MainFragment)
}