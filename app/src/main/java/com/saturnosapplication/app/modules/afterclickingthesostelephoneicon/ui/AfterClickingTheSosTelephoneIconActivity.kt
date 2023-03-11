package com.saturnosapplication.app.modules.afterclickingthesostelephoneicon.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saturnosapplication.app.R
import com.saturnosapplication.app.appcomponents.base.BaseActivity
import com.saturnosapplication.app.databinding.ActivityAfterClickingTheSosTelephoneIconBinding
import com.saturnosapplication.app.modules.afterclickingthesostelephoneicon.`data`.viewmodel.AfterClickingTheSosTelephoneIconVM
import com.saturnosapplication.app.modules.hlfgc.ui.HlFgcActivity
import com.saturnosapplication.app.modules.startconvo.ui.StartConvoActivity
import kotlin.String
import kotlin.Unit

class AfterClickingTheSosTelephoneIconActivity :
    BaseActivity<ActivityAfterClickingTheSosTelephoneIconBinding>(R.layout.activity_after_clicking_the_sos_telephone_icon)
    {
  private val viewModel: AfterClickingTheSosTelephoneIconVM by
      viewModels<AfterClickingTheSosTelephoneIconVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.afterClickingTheSosTelephoneIconVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnYes.setOnClickListener {
      val destIntent = HlFgcActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnNo.setOnClickListener {
      val destIntent = StartConvoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "AFTER_CLICKING_THE_SOS_TELEPHONE_ICON_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AfterClickingTheSosTelephoneIconActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
