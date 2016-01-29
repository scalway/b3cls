package com.scalway.scalatags.b3.abst

import com.scalway.scalatags.b3.abst.B3Classes.CREATE

/**
  * Created by slovic on 29.01.16.
  */
trait B3MediaQueryClasses[SIZE_RET] extends Any with B3SizedClasses[SIZE_RET] with B3Classes {
  //only md is missing. We dont need them in SizedClass
  /** medium size**/
  def md(implicit c:CREATE[SIZE_RET]):SIZE_RET = append[SIZE_RET](className+"-md")
}

