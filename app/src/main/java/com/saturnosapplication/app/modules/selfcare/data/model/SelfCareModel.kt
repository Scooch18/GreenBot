package com.saturnosapplication.app.modules.selfcare.`data`.model

import com.saturnosapplication.app.R
import com.saturnosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SelfCareModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelfCare: String? = MyApp.getInstance().resources.getString(R.string.lbl_self_care)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_march_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_sun_mon_tue)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg_5_6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHowyourfeelin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_how_your_feelin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTakeabreathin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_take_a_breathin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDailyBreathing: String? =
      MyApp.getInstance().resources.getString(R.string.msg_daily_breathing)

)
