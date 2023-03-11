package com.saturnosapplication.app.modules.afterclickingthesostelephoneicon.`data`.model

import com.saturnosapplication.app.R
import com.saturnosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AfterClickingTheSosTelephoneIconModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYoupresstheb: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_press_the_b)

)
