package com.saturnosapplication.app.modules.mhchotlines.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saturnosapplication.app.R
import com.saturnosapplication.app.appcomponents.base.BaseActivity
import com.saturnosapplication.app.appcomponents.views.ImagePickerFragmentDialog
import com.saturnosapplication.app.databinding.ActivityMhcHotlinesBinding
import com.saturnosapplication.app.modules.hlfgc.ui.HlFgcActivity
import com.saturnosapplication.app.modules.mhchotlines.`data`.viewmodel.MhcHotlinesVM
import kotlin.String
import kotlin.Unit

class MhcHotlinesActivity : BaseActivity<ActivityMhcHotlinesBinding>(R.layout.activity_mhc_hotlines)
    {
  private val viewModel: MhcHotlinesVM by viewModels<MhcHotlinesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mhcHotlinesVM = viewModel
  }

  override fun setUpClicks(): Unit {


    binding.imageCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
    binding.imageArrowleft.setOnClickListener {
      val destIntent = HlFgcActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "MHC_HOTLINES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MhcHotlinesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
