package com.saturnosapplication.app.modules.no.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saturnosapplication.app.modules.no.`data`.model.NoModel
import org.koin.core.KoinComponent

class NoVM : ViewModel(), KoinComponent {
  val noModel: MutableLiveData<NoModel> = MutableLiveData(NoModel())

  var navArguments: Bundle? = null
}
