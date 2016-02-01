package com.scalway.scalatags.bootstrap3.aspects

import com.scalway.scalatags.bootstrap3.abst.B3Cls

/**
  * Created by slovic on 29.01.16.
  */
object Img {

  implicit class B3ImageCls(val allClassNames:Seq[String]) extends AnyVal
    with B3Cls {
    def className: String = "img"

    /* Adds rounded corners to an image (not available in IE8)*/
    def rounded = apply(className+"-rounded")

    /* Shapes the image to a circle (not available in IE8)*/
    def circle = apply(className+"-circle")

    /* Shapes the image to a thumbnail*/
    def thumbnail = apply(className+"-thumbnail")

    /* Makes an image responsive (will scale nicely to the parent element)*/
    def responsive = apply(className+"-responsive")


  }

}

