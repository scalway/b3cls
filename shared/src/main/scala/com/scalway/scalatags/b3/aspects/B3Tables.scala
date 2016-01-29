package com.scalway.scalatags.b3.aspects

import com.scalway.scalatags.b3.abst.{B3Classes, B3SizedClasses, B3StyledClasses}

/**
  * Created by slovic on 29.01.16.
  */
object B3Tables {

  implicit class B3TablesClasses(val allClassNames:Seq[String]) extends AnyVal
    with B3Classes {
    def className: String = "table"

    /*Adds zebra.striping to any table row within <tbody> (not available in IE8)*/
    def striped = append(className + "-striped")

    /*Adds border on all sides of the table and cells*/
    def bordered = append(className + "-bordered");

    /*Enables a hover state on table rows within a <tbody>*/
    def hover = append(className + "-hover");

    /*Makes table more compact by cutting cell padding in half*/
    def condensed = append(className + "-condensed");

  }

}

