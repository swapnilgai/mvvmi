package java.com.mvvm_i

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.fragment_container
import java.com.mvvm_i.network.ApiAccess
import javax.inject.Inject

class MainActivity : AppCompatActivity(){

  @Inject
  lateinit var mainFragment: MainFragment

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    App.fragmetComponent.inject(this)

    fragmentManager.beginTransaction().add(fragment_container.id, mainFragment).commit()
  }
}
