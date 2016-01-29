package com.scalway.scalatags.b3.abst

import com.scalway.scalatags.b3.abst.B3Classes._

/**
  * Created by slovic on 29.01.16.
  */
trait B3Classes extends Any {
  protected def append[T](str:String)(implicit c:CREATE[T]):T = c(str +: allClassNames)
  protected val allClassNames:Seq[String]
  def apply(cls:String*):B3Classes = new B3Classes {
    override val allClassNames: Seq[String] = allClassNames ++ cls
  }

  def str: String = classes.mkString(" ")
  def classes = allClassNames.filter(_!=null)
}

object B3Classes {
  type CREATE[T] = Seq[String] => T
}

