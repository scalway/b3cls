package com.scalway.scalatags.b3.aspects

import com.scalway.scalatags.b3.abst.B3Classes.CREATE
import com.scalway.scalatags.b3.abst.{B3ComplexOrClasses, B3MediaQueryClasses, B3Classes}

/**
  * Created by slovic on 29.01.16.
  */

object B3Visible {
  /* tricky way to make hidden media query aware. If someone
    use media query element then we throw away pure hidden element.
     */
  class B3VisibleOnlyClasses(val allClassNames:Seq[String]) extends AnyVal
    with B3MediaQueryClasses[B3VisibleClassesExt]
    with B3ComplexOrClasses {
    override def className: String = "visible"
  }

  implicit class B3VisibleClasses(val allClassNames:Seq[String]) extends AnyVal with B3Classes
    with B3MediaQueryClasses[B3VisibleClassesExt] {
    def className: String = "visible"
  }



  implicit class B3VisibleClassesExt(val allClassNames:Seq[String]) extends AnyVal with B3Classes
    with B3MediaQueryClasses[B3VisibleClassesExt] {
    def inline:B3VisibleClasses = new B3VisibleClasses((allClassNames.head +"-inline") +: allClassNames.tail)
    def block:B3VisibleClasses = new B3VisibleClasses((allClassNames.head +"-block") +: allClassNames.tail)
    def inlineBlock:B3VisibleClasses = new B3VisibleClasses((allClassNames.head +"-inline-block") +: allClassNames.tail)
    override def className: String = "visible"
  }

  implicit class B3HiddenClasses(val allClassNames:Seq[String]) extends AnyVal
    with B3MediaQueryClasses[B3HiddenClasses] with B3Classes {
    override def className: String = "hidden"
  }


  class B3HiddenOnlyClasses(val allClassNames:Seq[String]) extends AnyVal
    with B3MediaQueryClasses[B3HiddenClasses]
    with B3ComplexOrClasses {
    override def className: String = "hidden"
  }



}
