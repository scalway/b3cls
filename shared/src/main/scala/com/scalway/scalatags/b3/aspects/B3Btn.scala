package com.scalway.scalatags.b3.aspects

import com.scalway.scalatags.b3.abst.{B3StyledClasses, B3SizedClasses, B3Classes}

/**
  * Created by slovic on 29.01.16.
  */
object B3Btn {

  implicit class B3BtnClasses(val allClassNames:Seq[String]) extends AnyVal
    with B3Classes
    with B3SizedClasses[B3BtnClasses]
    with B3StyledClasses[B3BtnClasses] {
    override def className: String = "btn"

    /** Makes a button look like a link (will still have button behavior) */
    def link = append[B3BtnClasses](className+"-link")

    /** Makes a block-level button (spans the full width of the parent element) */
    def block = append[B3BtnClasses](className+"-block")

    /** Makes the button appear pressed */
    def active = append[B3BtnClasses]("active")

    /** Makes the button disabled */
    def disabled = append[B3BtnClasses]("disabled")
  }

}

