package com.scalway.b3cls.impl.aspects

import com.scalway.b3cls.impl.abst.B3Cls

/**
  * Created by slovic on 29.01.16.
  */
object Nav {

  implicit class B3NavCls(val allClassNames:Seq[String]) extends AnyVal
    with B3Cls {
    def className: String = "nav"

    /** Creates navigation tabs */
    def tabs = append[B3NavCls](className+"-tabs")

    /** Creates navigation pills */
    def pills = append[B3NavCls](className+"-pills")

    /** Creates vertical navigation pills */
    def stacked = append[B3NavCls](className+"-stacked")

    /** Makes navigation tabs/pills equal widths of their parent,
      * at screens wider than 768px. On smaller screens, the nav tabs/pills are stacked
      */
    def justified = append[B3NavCls](className+"-justified")
  }

  implicit class B3TabsCls(val allClassNames:Seq[String]) extends AnyVal
    with B3Cls {
    def className: String = "tab"

    /*Together with .tab.pane and data.toggle="tab" (data.toggle="pill" for pills), it makes the tab/pill toggable*/
    def content = apply(className + "-content")

    /*Together with .tab.content and data.toggle="tab" (data.toggle="pill" for pills), it makes the tab/pill toggable*/
    def pane = apply(className + "-pane")


  }
}

