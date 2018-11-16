package java.com.mvvm_i.network

import io.reactivex.Single

class ApiAccessService(val apiAccess: ApiAccess) {

  fun getApiAccess(): Single<String> {
    return apiAccess.getImageMetadata("")
  }
}
