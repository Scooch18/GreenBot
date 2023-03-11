package com.saturnosapplication.app.modules.forguidanceconsultation.`data`.model

import com.saturnosapplication.app.R
import com.saturnosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ForGuidanceConsultationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGreenBot: String? = MyApp.getInstance().resources.getString(R.string.lbl_greenbot)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWewillsendyo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_will_send_yo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDoyouwantto: String? = MyApp.getInstance().resources.getString(R.string.msg_do_you_want_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYes: String? = MyApp.getInstance().resources.getString(R.string.lbl_yes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNo: String? = MyApp.getInstance().resources.getString(R.string.lbl_no)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etMHCReplyValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etTypeamessageValue: String? = null
)
