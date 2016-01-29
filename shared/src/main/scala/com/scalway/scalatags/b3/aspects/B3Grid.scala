package com.scalway.scalatags.b3.aspects

import com.scalway.scalatags.b3.abst.B3Classes

/**
  * Created by slovic on 29.01.16.
  */
object B3Grid {

  implicit class B3ColClasses(val allClassNames:Seq[String]) extends AnyVal with B3Classes {
    private def className(name:String, value:Int): String =
      if (value>=0) s"col-$name-$value"
      else          null

    protected def append(name:String, size:Int, offset:Int,pull:Int= -1, push:Int= -1) =
      new B3ColClasses( Seq(
        className(name + "-pull", pull),
        className(name + "-push", push),
        className(name + "-offset", offset),
        className(name, size)) ++ allClassNames)

    def xs(size:Int, offset:Int= -1, pull:Int= -1, push:Int= -1) = append("xs", size, offset, pull, push)
    def md(size:Int, offset:Int= -1, pull:Int= -1, push:Int= -1) = append("md", size, offset, pull, push)
    def sm(size:Int, offset:Int= -1, pull:Int= -1, push:Int= -1) = append("sm", size, offset, pull, push)
    def lg(size:Int, offset:Int= -1, pull:Int= -1, push:Int= -1) = append("lg", size, offset, pull, push)
  }

}

