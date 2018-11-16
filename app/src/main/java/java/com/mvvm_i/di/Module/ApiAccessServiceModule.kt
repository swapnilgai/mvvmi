package java.com.mvvm_i.di.Module

import dagger.Module
import dagger.Provides
import java.com.mvvm_i.di.ForActivity
import java.com.mvvm_i.network.ApiAccess
import java.com.mvvm_i.network.ApiAccessService


@Module
class ApiAccessServiceModule {

  @Provides
  @ForActivity
  fun getApiAccessService(apiAccess: ApiAccess): ApiAccessService {
    return ApiAccessService(apiAccess)
  }

}