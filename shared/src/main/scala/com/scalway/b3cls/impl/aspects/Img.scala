package com.scalway.b3cls.impl.aspects

import com.scalway.b3cls.impl.abst.B3Cls

/**
  * Created by slovic on 29.01.16.
  */
object Img {

  implicit class B3ImageCls(val allClassNames:Seq[String]) extends AnyVal
    with B3Cls {
    protected def append(str: String*) = super.append[B3ImageCls](str :_*)

    def className: String = "img"

    /* Adds rounded corners to an image (not available in IE8)*/
    def rounded = append(className+"-rounded")

    /* Shapes the image to a circle (not available in IE8)*/
    def circle = append(className+"-circle")

    /* Shapes the image to a thumbnail*/
    def thumbnail = append(className+"-thumbnail")

    /* Makes an image responsive (will scale nicely to the parent element)*/
    def responsive = append(className+"-responsive")


  }

}

