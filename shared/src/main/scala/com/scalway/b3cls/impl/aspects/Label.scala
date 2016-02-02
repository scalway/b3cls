package com.scalway.b3cls.impl.aspects

import com.scalway.b3cls.impl.abst.{B3StyledCls, B3Cls}

/**
  * Created by slovic on 29.01.16.
  */
object Label {

  implicit class B3LabelCls(val allClassNames:Seq[String]) extends AnyVal
    with B3Cls
    with B3StyledCls[B3LabelCls] {
    override def className: String = "label"
  }

}

