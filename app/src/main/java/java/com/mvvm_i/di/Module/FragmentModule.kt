package java.com.mvvm_i.di.Module

import dagger.Module
import dagger.Provides
import java.com.mvvm_i.MainFragment
import java.com.mvvm_i.di.ForActivity

@Module
class FragmentModule {

  @Provides
  @ForActivity
  fun getFragment(): MainFragment{
    return MainFragment()
  }
}