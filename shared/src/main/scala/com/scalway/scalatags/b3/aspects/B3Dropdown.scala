package com.scalway.scalatags.b3.aspects

import com.scalway.scalatags.b3.abst.{B3SimpleClasses, B3Classes, B3SizedClasses, B3StyledClasses}

/**
  * Created by slovic on 29.01.16.
  */
object B3Dropdown {

  implicit class B3DropdownClasses(val allClassNames:Seq[String]) extends AnyVal
    with B3Classes {
    def className: String = "dropdown"

    /*Builds the dropdown menu*/
    def menu = new B3SimpleClasses(Seq(className+"-menu"))

    /*Right.aligns a dropdown menu*/
    def menuRight = new B3SimpleClasses(Seq(className+"-menu-right"))

    /*Adds a header inside the dropdown menu*/
    def header = new B3SimpleClasses(Seq(className+"-header"))

  }

}

