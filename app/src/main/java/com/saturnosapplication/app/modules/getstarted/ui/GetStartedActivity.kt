package com.saturnosapplication.app.modules.getstarted.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.saturnosapplication.app.R
import com.saturnosapplication.app.appcomponents.base.BaseActivity
import com.saturnosapplication.app.databinding.ActivityGetStartedBinding
import com.saturnosapplication.app.modules.getstarted.`data`.viewmodel.GetStartedVM
import com.saturnosapplication.app.modules.registrationui.ui.RegistrationUiActivity
import kotlin.String
import kotlin.Unit

class GetStartedActivity : BaseActivity<ActivityGetStartedBinding>(R.layout.activity_get_started) {
  private val viewModel: GetStartedVM by viewModels<GetStartedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.getStartedVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = RegistrationUiActivity.getIntent(this, null)
      startActivity(destIntent)
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.btnGetStarted.setOnClickListener {
        val destIntent = RegistrationUiActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "GET_STARTED_ACTIVITY"

    }
  }
