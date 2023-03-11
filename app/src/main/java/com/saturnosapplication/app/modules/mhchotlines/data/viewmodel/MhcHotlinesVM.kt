package com.saturnosapplication.app.modules.mhchotlines.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saturnosapplication.app.modules.mhchotlines.`data`.model.MhcHotlinesModel
import org.koin.core.KoinComponent

class MhcHotlinesVM : ViewModel(), KoinComponent {
  val mhcHotlinesModel: MutableLiveData<MhcHotlinesModel> = MutableLiveData(MhcHotlinesModel())

  var navArguments: Bundle? = null
}
