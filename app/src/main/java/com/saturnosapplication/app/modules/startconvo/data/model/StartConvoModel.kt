package com.saturnosapplication.app.modules.startconvo.`data`.model

import com.saturnosapplication.app.R
import com.saturnosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class StartConvoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGreenBot: String? = MyApp.getInstance().resources.getString(R.string.lbl_greenbot)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloImaMe: String? = MyApp.getInstance().resources.getString(R.string.msg_hello_i_m_a_me)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHi: String? = MyApp.getInstance().resources.getString(R.string.lbl_hi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHellothere: String? = MyApp.getInstance().resources.getString(R.string.lbl_hello_there)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGoodbye: String? = MyApp.getInstance().resources.getString(R.string.lbl_goodbye)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etImgchatValue: String? = null
)
