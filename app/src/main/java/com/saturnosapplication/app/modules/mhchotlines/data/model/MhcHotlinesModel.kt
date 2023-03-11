package com.saturnosapplication.app.modules.mhchotlines.`data`.model

import com.saturnosapplication.app.R
import com.saturnosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MhcHotlinesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMentalHealthH: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mental_health_h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_laguna_provinci)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_national_center)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_philippine_ment)

)
