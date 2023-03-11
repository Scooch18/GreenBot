package com.saturnosapplication.app.modules.privacyui.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saturnosapplication.app.modules.privacyui.`data`.model.PrivacyUiModel
import org.koin.core.KoinComponent

class PrivacyUiVM : ViewModel(), KoinComponent {
  val privacyUiModel: MutableLiveData<PrivacyUiModel> = MutableLiveData(PrivacyUiModel())

  var navArguments: Bundle? = null
}
