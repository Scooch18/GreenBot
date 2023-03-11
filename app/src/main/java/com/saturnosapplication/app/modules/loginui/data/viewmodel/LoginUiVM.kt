package com.saturnosapplication.app.modules.loginui.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saturnosapplication.app.modules.loginui.`data`.model.LoginUiModel
import org.koin.core.KoinComponent

class LoginUiVM : ViewModel(), KoinComponent {
  val loginUiModel: MutableLiveData<LoginUiModel> = MutableLiveData(LoginUiModel())

  var navArguments: Bundle? = null
}
