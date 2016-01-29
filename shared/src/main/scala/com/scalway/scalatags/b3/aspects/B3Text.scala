package com.scalway.scalatags.b3.aspects

import com.scalway.scalatags.b3.abst.{B3Classes, B3SizedClasses, B3StyledClasses}

/**
  * Created by slovic on 29.01.16.
  */
object B3Text {

  implicit class B3TextClasses(val allClassNames:Seq[String]) extends AnyVal
    with B3Classes with B3StyledClasses[B3TextClasses] {
    override def className: String = "text"

    /** Makes a button look like a link (will still have button behavior) */
    def muted = append[B3TextClasses](className+"-muted")
  }

  implicit class B3BackgroundClasses(val allClassNames:Seq[String]) extends AnyVal
    with B3Classes with B3StyledClasses[B3BackgroundClasses] {
    override def className: String = "bg"
  }



}

