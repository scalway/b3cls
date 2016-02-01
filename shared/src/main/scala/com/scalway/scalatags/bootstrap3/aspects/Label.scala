package com.scalway.scalatags.bootstrap3.aspects

import com.scalway.scalatags.bootstrap3.abst.{B3Cls, B3SizedCls, B3StyledCls}

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

