package com.scalway.b3cls.impl.aspects

import com.scalway.b3cls.impl.abst.{B3Cls, B3ComplexOrCls, MediaQueryCls}
import B3Cls.{MODEL, CREATE}

/**
  * Created by slovic on 29.01.16.
  */

object Visible {
  /* tricky way to make hidden media query aware. If someone
    use media query element then we throw away pure hidden element.
     */
  class VisibleOnlyCls(val allClassNames:MODEL) extends AnyVal
    with MediaQueryCls[VisibleExtCls]
    with B3ComplexOrCls {
    override def className: String = "visible"
  }

  implicit class VisibleCls(val allClassNames:MODEL) extends AnyVal with B3Cls
    with MediaQueryCls[VisibleExtCls] {
    def className: String = "visible"
  }



  implicit class VisibleExtCls(val allClassNames:MODEL) extends AnyVal
    with B3Cls
    with MediaQueryCls[VisibleExtCls] {
    def inline:VisibleCls = appendToLast[VisibleCls]("-inline")
    def block:VisibleCls = appendToLast[VisibleCls]("-block")
    def inlineBlock:VisibleCls = appendToLast[VisibleCls]("-inline-block")
    override def className: String = "visible"
  }

  implicit class HiddenCls(val allClassNames:MODEL) extends AnyVal
    with MediaQueryCls[HiddenCls] with B3Cls {
    override def className: String = "hidden"
  }


  class B3HiddenOnlyCls(val allClassNames:MODEL) extends AnyVal
    with MediaQueryCls[HiddenCls]
    with B3ComplexOrCls {
    override def className: String = "hidden"
  }



}
