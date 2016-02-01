package com.scalway.scalatags.bootstrap3.abst

import com.scalway.scalatags.bootstrap3.abst.B3Cls.CREATE

/**
  * Created by slovic on 29.01.16.
  */
trait B3SizedCls[SIZE_RET] extends Any with B3Cls {
  def className:String
  def xs(implicit c:CREATE[SIZE_RET]):SIZE_RET = append[SIZE_RET](className + "-xs")
  def sm(implicit c:CREATE[SIZE_RET]):SIZE_RET = append[SIZE_RET](className + "-sm")
  def lg(implicit c:CREATE[SIZE_RET]):SIZE_RET = append[SIZE_RET](className + "-lg")
}

