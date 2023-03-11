package com.saturnosapplication.app.modules.privacyui.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saturnosapplication.app.R
import com.saturnosapplication.app.appcomponents.base.BaseActivity
import com.saturnosapplication.app.databinding.ActivityPrivacyUiBinding
import com.saturnosapplication.app.modules.privacyui.`data`.viewmodel.PrivacyUiVM
import com.saturnosapplication.app.modules.startconvo.ui.StartConvoActivity
import kotlin.String
import kotlin.Unit

class PrivacyUiActivity : BaseActivity<ActivityPrivacyUiBinding>(R.layout.activity_privacy_ui) {
  private val viewModel: PrivacyUiVM by viewModels<PrivacyUiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.privacyUiVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNext.setOnClickListener {
      val destIntent = StartConvoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PRIVACY_UI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PrivacyUiActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
