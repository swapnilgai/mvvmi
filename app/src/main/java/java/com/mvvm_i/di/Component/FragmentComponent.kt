package java.com.mvvm_i.di.Component

import dagger.Subcomponent
import java.com.mvvm_i.MainActivity
import java.com.mvvm_i.MainFragment
import java.com.mvvm_i.di.ForActivity
import java.com.mvvm_i.di.Module.ApiAccessServiceModule
import java.com.mvvm_i.di.Module.FragmentModule

@ForActivity
@Subcomponent(modules = [FragmentModule::class, ApiAccessServiceModule::class])
interface FragmentComponent {
  fun inject(mainActivity: MainActivity)

  fun inject(mainFragment: MainFragment)
}