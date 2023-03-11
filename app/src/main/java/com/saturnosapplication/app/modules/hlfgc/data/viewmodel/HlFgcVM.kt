package com.saturnosapplication.app.modules.hlfgc.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saturnosapplication.app.modules.hlfgc.`data`.model.HlFgcModel
import org.koin.core.KoinComponent

class HlFgcVM : ViewModel(), KoinComponent {
  val hlFgcModel: MutableLiveData<HlFgcModel> = MutableLiveData(HlFgcModel())

  var navArguments: Bundle? = null
}
