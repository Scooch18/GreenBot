package com.saturnosapplication.app.modules.selfcare.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saturnosapplication.app.modules.selfcare.`data`.model.SelfCareModel
import org.koin.core.KoinComponent

class SelfCareVM : ViewModel(), KoinComponent {
  val selfCareModel: MutableLiveData<SelfCareModel> = MutableLiveData(SelfCareModel())

  var navArguments: Bundle? = null
}
