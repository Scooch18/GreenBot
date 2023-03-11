package com.saturnosapplication.app.modules.hlfgc.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saturnosapplication.app.R
import com.saturnosapplication.app.appcomponents.base.BaseActivity
import com.saturnosapplication.app.databinding.ActivityHlFgcBinding
import com.saturnosapplication.app.modules.afterclickingthesostelephoneicon.ui.AfterClickingTheSosTelephoneIconActivity
import com.saturnosapplication.app.modules.forguidanceconsultation.ui.ForGuidanceConsultationActivity
import com.saturnosapplication.app.modules.hlfgc.`data`.viewmodel.HlFgcVM
import com.saturnosapplication.app.modules.mhchotlines.ui.MhcHotlinesActivity
import kotlin.String
import kotlin.Unit

class HlFgcActivity : BaseActivity<ActivityHlFgcBinding>(R.layout.activity_hl_fgc) {
  private val viewModel: HlFgcVM by viewModels<HlFgcVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.hlFgcVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      val destIntent = AfterClickingTheSosTelephoneIconActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
    binding.btnHotlines.setOnClickListener {
      val destIntent = MhcHotlinesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewRectangleEight.setOnClickListener {
      val destIntent = ForGuidanceConsultationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HL_FGC_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HlFgcActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
