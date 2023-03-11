package com.saturnosapplication.app.modules.startconvo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saturnosapplication.app.modules.startconvo.`data`.model.StartConvoModel
import org.koin.core.KoinComponent

class StartConvoVM : ViewModel(), KoinComponent {
  val startConvoModel: MutableLiveData<StartConvoModel> = MutableLiveData(StartConvoModel())

  var navArguments: Bundle? = null
}
