package com.saturnosapplication.app.modules.yes.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saturnosapplication.app.modules.yes.`data`.model.YesModel
import org.koin.core.KoinComponent

class YesVM : ViewModel(), KoinComponent {
  val yesModel: MutableLiveData<YesModel> = MutableLiveData(YesModel())

  var navArguments: Bundle? = null
}
