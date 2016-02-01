package com.scalway.scalatags.bootstrap3.abst

import java.util.logging.Logger

import com.scalway.scalatags.bootstrap3.abst.B3Cls._

/**
  * Created by slovic on 29.01.16.
  */
trait B3Cls extends Any { self =>
  protected val allClassNames:MODEL

  /**
    *
    * how to add new string to collection
 *
    * @param str what class add to collection
    * @param c describe how to create result
    * @tparam T what should be result type
    * @return new collection with added this class name
    */
  protected def append[T](str:String)(implicit c:CREATE[T]):T = c(str +: allClassNames)

  protected def concatToLast[T](up:String => String)(implicit c:CREATE[T]):T = c(up(allClassNames.head) +: allClassNames.tail)

  protected def concatToLast[T](append:String)(implicit c:CREATE[T]):T = c((allClassNames.head + append) +: allClassNames.tail)

  protected def appendAll[T](str:MODEL)(implicit c:CREATE[T]):T = c(str ++ allClassNames)

  /** same as append but create same type */
//  protected def appendThis(str:String*)(implicit c:CREATE[this.type]):this.type = append[this.type](str)(c)

  //describe what string class are always used with this class group
  protected def alwaysInclude():MODEL = List()

  //describe what class names are forbidden
  protected def alwaysExclude():MODEL = List()

  //just adds classes to collection. It should be overriden to work properly
  @deprecated("we should use append or appendThis")
  def apply(cls:String):B3Cls = new B3Cls {
    override val allClassNames: MODEL = cls +: self.allClassNames
  }

  override def toString: String = classes.mkString(" ")
  def classes = allClassNames.filter(_!=null)
}

object B3Cls {
  val logger = Logger.getLogger("B3Classes")
  type MODEL = Seq[String]
  type CREATE[T] = MODEL => T
}

