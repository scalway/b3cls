package com.scalway.b3cls.impl.abst

import B3Cls.CREATE

/**
  * Created by slovic on 29.01.16.
  */
trait MediaQueryCls[SIZE_RET] extends Any with B3SizedCls[SIZE_RET] with B3Cls {
  //only md is missing. We dont need them in SizedClass
  /** medium size**/
  def md(implicit c:CREATE[SIZE_RET]):SIZE_RET = append[SIZE_RET](className+"-md")
}

