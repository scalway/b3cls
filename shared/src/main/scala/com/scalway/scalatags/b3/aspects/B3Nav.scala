package com.scalway.scalatags.b3.aspects

import com.scalway.scalatags.b3.abst.{B3Classes, B3SizedClasses, B3StyledClasses}

/**
  * Created by slovic on 29.01.16.
  */
object B3Nav {

  implicit class B3NavClasses(val allClassNames:Seq[String]) extends AnyVal
    with B3Classes {
    def className: String = "nav"

    /** Creates navigation tabs */
    def tabs = append[B3NavClasses](className+"-tabs")

    /** Creates navigation pills */
    def pills = append[B3NavClasses](className+"-pills")

    /** Creates vertical navigation pills */
    def stacked = append[B3NavClasses](className+"-stacked")

    /** Makes navigation tabs/pills equal widths of their parent,
      * at screens wider than 768px. On smaller screens, the nav tabs/pills are stacked
      */
    def justified = append[B3NavClasses](className+"-justified")
  }

  implicit class B3TabsClasses(val allClassNames:Seq[String]) extends AnyVal
    with B3Classes {
    def className: String = "tab"

    /*Together with .tab.pane and data.toggle="tab" (data.toggle="pill" for pills), it makes the tab/pill toggable*/
    def content = apply(className + "-content")

    /*Together with .tab.content and data.toggle="tab" (data.toggle="pill" for pills), it makes the tab/pill toggable*/
    def pane = apply(className + "-pane")


  }
}

