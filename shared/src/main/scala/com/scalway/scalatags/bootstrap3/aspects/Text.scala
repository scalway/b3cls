package com.scalway.scalatags.bootstrap3.aspects

import com.scalway.scalatags.bootstrap3.abst.{B3Cls, B3SizedCls, B3StyledCls}

/**
  * Created by slovic on 29.01.16.
  */
object Text {

  implicit class B3TextCls(val allClassNames:Seq[String]) extends AnyVal
    with B3Cls with B3StyledCls[B3TextCls] {
    override def className: String = "text"

    /** Makes a button look like a link (will still have button behavior) */
    def muted = append[B3TextCls](className+"-muted")
  }

  implicit class B3BackgroundCls(val allClassNames:Seq[String]) extends AnyVal
    with B3Cls with B3StyledCls[B3BackgroundCls] {
    override def className: String = "bg"
  }



}

