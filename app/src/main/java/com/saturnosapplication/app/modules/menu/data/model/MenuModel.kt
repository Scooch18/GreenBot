package com.saturnosapplication.app.modules.menu.`data`.model

import com.saturnosapplication.app.R
import com.saturnosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MenuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSample: String? = MyApp.getInstance().resources.getString(R.string.lbl_sample)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccount: String? = MyApp.getInstance().resources.getString(R.string.lbl_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccountSetting: String? =
      MyApp.getInstance().resources.getString(R.string.msg_account_setting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLegalandpolic: String? =
      MyApp.getInstance().resources.getString(R.string.msg_legal_and_polic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTermsofServic: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terms_of_servic2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrivacyPolicy: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_privacy_policy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLicenses: String? = MyApp.getInstance().resources.getString(R.string.lbl_licenses)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_are_you_sure_yo)

)
