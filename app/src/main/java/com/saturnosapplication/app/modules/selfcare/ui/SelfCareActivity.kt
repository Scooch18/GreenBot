package com.saturnosapplication.app.modules.selfcare.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saturnosapplication.app.R
import com.saturnosapplication.app.appcomponents.base.BaseActivity
import com.saturnosapplication.app.databinding.ActivitySelfCareBinding
import com.saturnosapplication.app.modules.selfcare.`data`.viewmodel.SelfCareVM
import com.saturnosapplication.app.modules.startconvo.ui.StartConvoActivity
import kotlin.String
import kotlin.Unit

class SelfCareActivity : BaseActivity<ActivitySelfCareBinding>(R.layout.activity_self_care) {
  private val viewModel: SelfCareVM by viewModels<SelfCareVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.selfCareVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      val destIntent = StartConvoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "SELF_CARE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SelfCareActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
