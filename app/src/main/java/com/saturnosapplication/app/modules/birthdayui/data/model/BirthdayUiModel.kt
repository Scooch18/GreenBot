package com.saturnosapplication.app.modules.birthdayui.`data`.model

import com.saturnosapplication.app.R
import com.saturnosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BirthdayUiModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChooseyourDat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_your_dat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThiswontbes: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_won_t_be_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etLanguageValue: String? = null
)
