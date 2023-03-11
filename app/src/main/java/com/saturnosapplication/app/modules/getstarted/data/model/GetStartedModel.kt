package com.saturnosapplication.app.modules.getstarted.`data`.model

import com.saturnosapplication.app.R
import com.saturnosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GetStartedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcometo: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGreenBotaPNC: String? =
      MyApp.getInstance().resources.getString(R.string.msg_greenbot_a_pnc)

)
