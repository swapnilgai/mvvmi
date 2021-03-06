package java.com.mvvm_i.network

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import javax.inject.Inject


interface ApiAccess {
  @GET("images/{id}")
  fun getImageMetadata(@Path("id") id: String): Single<String>
}