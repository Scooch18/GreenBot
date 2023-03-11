package com.saturnosapplication.app.modules.birthdayui.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saturnosapplication.app.modules.birthdayui.`data`.model.BirthdayUiModel
import org.koin.core.KoinComponent

class BirthdayUiVM : ViewModel(), KoinComponent {
  val birthdayUiModel: MutableLiveData<BirthdayUiModel> = MutableLiveData(BirthdayUiModel())

  var navArguments: Bundle? = null
}
