package com.saturnosapplication.app.modules.birthdayui.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saturnosapplication.app.R
import com.saturnosapplication.app.appcomponents.base.BaseActivity
import com.saturnosapplication.app.databinding.ActivityBirthdayUiBinding
import com.saturnosapplication.app.modules.birthdayui.`data`.viewmodel.BirthdayUiVM
import com.saturnosapplication.app.modules.privacyui.ui.PrivacyUiActivity
import kotlin.String
import kotlin.Unit

class BirthdayUiActivity : BaseActivity<ActivityBirthdayUiBinding>(R.layout.activity_birthday_ui) {
  private val viewModel: BirthdayUiVM by viewModels<BirthdayUiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.birthdayUiVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNext.setOnClickListener {
      val destIntent = PrivacyUiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BIRTHDAY_UI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BirthdayUiActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
