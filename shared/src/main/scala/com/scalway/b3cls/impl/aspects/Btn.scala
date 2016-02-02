package com.scalway.b3cls.impl.aspects

import com.scalway.b3cls.impl.abst.{B3StyledCls, B3Cls, B3SizedCls}

/**
  * Created by slovic on 29.01.16.
  */
object Btn {

  implicit class BtnCls(val allClassNames:Seq[String]) extends AnyVal
    with B3Cls
    with B3SizedCls[BtnCls]
    with B3StyledCls[BtnCls] {
    override def className: String = "btn"

    /** Makes a button look like a link (will still have button behavior) */
    def link = append[BtnCls](className+"-link")

    /** Makes a block-level button (spans the full width of the parent element) */
    def block = append[BtnCls](className+"-block")

    /** Makes the button appear pressed */
    def active = append[BtnCls]("active")

    /** Makes the button disabled */
    def disabled = append[BtnCls]("disabled")
  }

}

