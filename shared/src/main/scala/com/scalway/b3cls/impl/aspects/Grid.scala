package com.scalway.b3cls.impl.aspects

import com.scalway.b3cls.impl.abst.B3Cls

/**
  * Created by slovic on 29.01.16.
  */
object Grid {

  implicit class ColCls(val allClassNames:Seq[String]) extends AnyVal with B3Cls {

    private def className(name:String, value:Int): String =
      if (value>=0) s"col-$name-$value"
      else          null

    protected def append(name:String, size:Int, offset:Int,pull:Int= -1, push:Int= -1) =
      new ColCls( List(
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

