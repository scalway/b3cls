package com.scalway.scalatags.bootstrap3.aspects

import com.scalway.scalatags.bootstrap3.abst.{B3SimpleCls, B3Cls, B3SizedCls, B3StyledCls}

/**
  * Created by slovic on 29.01.16.
  */
object Dropdown {

  implicit class DropdownCls(val allClassNames:Seq[String]) extends AnyVal
    with B3Cls {
    def className: String = "dropdown"

    /*Builds the dropdown menu*/
    def menu = new B3SimpleCls(Seq(className+"-menu"))

    /*Right.aligns a dropdown menu*/
    def menuRight = new B3SimpleCls(Seq(className+"-menu-right"))

    /*Adds a header inside the dropdown menu*/
    def header = new B3SimpleCls(Seq(className+"-header"))

  }

}

