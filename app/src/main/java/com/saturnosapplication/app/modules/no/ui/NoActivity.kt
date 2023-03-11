package com.saturnosapplication.app.modules.no.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saturnosapplication.app.R
import com.saturnosapplication.app.appcomponents.base.BaseActivity
import com.saturnosapplication.app.databinding.ActivityNoBinding
import com.saturnosapplication.app.modules.no.`data`.viewmodel.NoVM
import kotlin.String
import kotlin.Unit

class NoActivity : BaseActivity<ActivityNoBinding>(R.layout.activity_no) {
  private val viewModel: NoVM by viewModels<NoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.noVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "NO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
