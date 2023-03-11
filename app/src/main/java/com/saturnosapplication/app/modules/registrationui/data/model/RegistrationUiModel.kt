package com.saturnosapplication.app.modules.registrationui.`data`.model

import com.saturnosapplication.app.R
import com.saturnosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RegistrationUiModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmyourpa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_confirm_your_pa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryouremai: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_emai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryourpass: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_pass)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryourname: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_enter_your_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)

)
