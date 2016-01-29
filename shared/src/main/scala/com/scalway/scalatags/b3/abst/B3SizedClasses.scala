package com.scalway.scalatags.b3.abst

import com.scalway.scalatags.b3.abst.B3Classes.CREATE

/**
  * Created by slovic on 29.01.16.
  */
trait B3SizedClasses[SIZE_RET] extends Any with B3Classes {
  def className:String
  def xs(implicit c:CREATE[SIZE_RET]):SIZE_RET = append[SIZE_RET](className + "-xs")
  def sm(implicit c:CREATE[SIZE_RET]):SIZE_RET = append[SIZE_RET](className + "-sm")
  def lg(implicit c:CREATE[SIZE_RET]):SIZE_RET = append[SIZE_RET](className + "-lg")
}

