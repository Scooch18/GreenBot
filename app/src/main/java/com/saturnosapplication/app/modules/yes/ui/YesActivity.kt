package com.saturnosapplication.app.modules.yes.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saturnosapplication.app.R
import com.saturnosapplication.app.appcomponents.base.BaseActivity
import com.saturnosapplication.app.databinding.ActivityYesBinding
import com.saturnosapplication.app.modules.yes.`data`.viewmodel.YesVM
import kotlin.String
import kotlin.Unit

class YesActivity : BaseActivity<ActivityYesBinding>(R.layout.activity_yes) {
  private val viewModel: YesVM by viewModels<YesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.yesVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "YES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, YesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
