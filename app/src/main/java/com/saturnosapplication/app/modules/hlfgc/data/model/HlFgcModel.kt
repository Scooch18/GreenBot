package com.saturnosapplication.app.modules.hlfgc.`data`.model

import com.saturnosapplication.app.R
import com.saturnosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HlFgcModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtForguidanceco: String? =
      MyApp.getInstance().resources.getString(R.string.msg_for_guidance_co)

)
