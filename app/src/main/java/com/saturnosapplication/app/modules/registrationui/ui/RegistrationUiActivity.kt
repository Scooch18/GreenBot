package com.saturnosapplication.app.modules.registrationui.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saturnosapplication.app.R
import com.saturnosapplication.app.appcomponents.base.BaseActivity
import com.saturnosapplication.app.databinding.ActivityRegistrationUiBinding
import com.saturnosapplication.app.modules.birthdayui.ui.BirthdayUiActivity
import com.saturnosapplication.app.modules.loginui.ui.LoginUiActivity
import com.saturnosapplication.app.modules.registrationui.`data`.viewmodel.RegistrationUiVM
import kotlin.String
import kotlin.Unit

class RegistrationUiActivity :
    BaseActivity<ActivityRegistrationUiBinding>(R.layout.activity_registration_ui) {
  private val viewModel: RegistrationUiVM by viewModels<RegistrationUiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registrationUiVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnRegister.setOnClickListener {
      val destIntent = BirthdayUiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtConfirmation.setOnClickListener {
      val destIntent = LoginUiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REGISTRATION_UI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegistrationUiActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
