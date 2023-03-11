package com.saturnosapplication.app.modules.forguidanceconsultation.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saturnosapplication.app.R
import com.saturnosapplication.app.appcomponents.base.BaseActivity
import com.saturnosapplication.app.databinding.ActivityForGuidanceConsultationBinding
import com.saturnosapplication.app.modules.forguidanceconsultation.`data`.viewmodel.ForGuidanceConsultationVM
import com.saturnosapplication.app.modules.no.ui.NoActivity
import com.saturnosapplication.app.modules.yes.ui.YesActivity
import kotlin.String
import kotlin.Unit

class ForGuidanceConsultationActivity :
    BaseActivity<ActivityForGuidanceConsultationBinding>(R.layout.activity_for_guidance_consultation)
    {
  private val viewModel: ForGuidanceConsultationVM by viewModels<ForGuidanceConsultationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forGuidanceConsultationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtYes.setOnClickListener {
      val destIntent = YesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtNo.setOnClickListener {
      val destIntent = NoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FOR_GUIDANCE_CONSULTATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForGuidanceConsultationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
