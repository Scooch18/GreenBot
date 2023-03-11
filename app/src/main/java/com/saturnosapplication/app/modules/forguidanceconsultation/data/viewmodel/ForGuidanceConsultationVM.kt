package com.saturnosapplication.app.modules.forguidanceconsultation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saturnosapplication.app.modules.forguidanceconsultation.`data`.model.ForGuidanceConsultationModel
import org.koin.core.KoinComponent

class ForGuidanceConsultationVM : ViewModel(), KoinComponent {
  val forGuidanceConsultationModel: MutableLiveData<ForGuidanceConsultationModel> =
      MutableLiveData(ForGuidanceConsultationModel())

  var navArguments: Bundle? = null
}
