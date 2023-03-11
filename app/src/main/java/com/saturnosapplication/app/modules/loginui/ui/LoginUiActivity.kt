package com.saturnosapplication.app.modules.loginui.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saturnosapplication.app.R
import com.saturnosapplication.app.appcomponents.base.BaseActivity
import com.saturnosapplication.app.databinding.ActivityLoginUiBinding
import com.saturnosapplication.app.modules.loginui.`data`.viewmodel.LoginUiVM
import com.saturnosapplication.app.modules.registrationui.ui.RegistrationUiActivity
import com.saturnosapplication.app.modules.startconvo.ui.StartConvoActivity
import kotlin.String
import kotlin.Unit

class LoginUiActivity : BaseActivity<ActivityLoginUiBinding>(R.layout.activity_login_ui) {
  private val viewModel: LoginUiVM by viewModels<LoginUiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginUiVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtConfirmation.setOnClickListener {
      val destIntent = RegistrationUiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSignin.setOnClickListener {
      val destIntent = StartConvoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_UI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginUiActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
