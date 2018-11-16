package java.com.mvvm_i


import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.com.mvvm_i.network.ApiAccess
import java.com.mvvm_i.network.ApiAccessService
import javax.inject.Inject


/**
 * A simple [Fragment] subclass.
 *
 */
class MainFragment : Fragment() {

  @Inject
  lateinit var apiAccessService: ApiAccessService

  @Inject
  lateinit var apiAccess: ApiAccess

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    // Inflate the layout for this fragment

    App.fragmentComponent.inject(this)

    apiAccessService.getApiAccess()

    return inflater.inflate(R.layout.fragment_main, container, false)
  }


}
