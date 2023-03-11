package com.saturnosapplication.app.modules.registrationui.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saturnosapplication.app.modules.registrationui.`data`.model.RegistrationUiModel
import org.koin.core.KoinComponent

class RegistrationUiVM : ViewModel(), KoinComponent {
  val registrationUiModel: MutableLiveData<RegistrationUiModel> =
      MutableLiveData(RegistrationUiModel())

  var navArguments: Bundle? = null
}
