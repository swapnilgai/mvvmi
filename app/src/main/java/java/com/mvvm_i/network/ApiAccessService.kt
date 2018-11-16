package java.com.mvvm_i.network

import android.content.Context
import io.reactivex.Single
import java.com.mvvm_i.di.ForActivity
import java.com.mvvm_i.di.ForApplication
import javax.inject.Inject

class ApiAccessService {

 @Inject
 lateinit var apiAccess: ApiAccess


  fun getApiAccess() : Single<String> {
    return apiAccess.getImageMetadata("")
  }
}
