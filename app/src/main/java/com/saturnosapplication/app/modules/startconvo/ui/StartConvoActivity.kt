package com.saturnosapplication.app.modules.startconvo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saturnosapplication.app.R
import com.saturnosapplication.app.appcomponents.base.BaseActivity
import com.saturnosapplication.app.databinding.ActivityStartConvoBinding
import com.saturnosapplication.app.modules.menu.ui.MenuActivity
import com.saturnosapplication.app.modules.selfcare.ui.SelfCareActivity
import com.saturnosapplication.app.modules.startconvo.`data`.viewmodel.StartConvoVM
import kotlin.String
import kotlin.Unit

class StartConvoActivity : BaseActivity<ActivityStartConvoBinding>(R.layout.activity_start_convo) {
  private val viewModel: StartConvoVM by viewModels<StartConvoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.startConvoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageMenu.setOnClickListener {
      val destIntent = MenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageWarning.setOnClickListener {
      val destIntent = SelfCareActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "START_CONVO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, StartConvoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
