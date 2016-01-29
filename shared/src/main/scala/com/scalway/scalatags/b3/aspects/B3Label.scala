package com.scalway.scalatags.b3.aspects

import com.scalway.scalatags.b3.abst.{B3Classes, B3SizedClasses, B3StyledClasses}

/**
  * Created by slovic on 29.01.16.
  */
object B3Label {

  implicit class B3LabelClasses(val allClassNames:Seq[String]) extends AnyVal
    with B3Classes
    with B3StyledClasses[B3LabelClasses] {
    override def className: String = "label"
  }

}

