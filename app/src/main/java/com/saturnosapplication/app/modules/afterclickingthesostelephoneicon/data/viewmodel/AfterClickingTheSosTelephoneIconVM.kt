package com.saturnosapplication.app.modules.afterclickingthesostelephoneicon.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saturnosapplication.app.modules.afterclickingthesostelephoneicon.`data`.model.AfterClickingTheSosTelephoneIconModel
import org.koin.core.KoinComponent

class AfterClickingTheSosTelephoneIconVM : ViewModel(), KoinComponent {
  val afterClickingTheSosTelephoneIconModel: MutableLiveData<AfterClickingTheSosTelephoneIconModel>
      = MutableLiveData(AfterClickingTheSosTelephoneIconModel())

  var navArguments: Bundle? = null
}
