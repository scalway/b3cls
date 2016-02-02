package com.scalway.scalatags.bootstrap3.aspects

import com.scalway.scalatags.bootstrap3.abst.B3Cls
import com.scalway.scalatags.bootstrap3.aspects.Btn.BtnCls
import com.scalway.scalatags.bootstrap3.aspects.Dropdown.DropdownCls
import com.scalway.scalatags.bootstrap3.aspects.Grid.ColCls
import com.scalway.scalatags.bootstrap3.aspects.Img.B3ImageCls
import com.scalway.scalatags.bootstrap3.aspects.Nav.B3NavCls
import com.scalway.scalatags.bootstrap3.aspects.Navbar.B3NavbarCls
import com.scalway.scalatags.bootstrap3.aspects.Tables.B3TablesCls
import com.scalway.scalatags.bootstrap3.aspects.Text.{B3BackgroundCls, B3TextCls}
import com.scalway.scalatags.bootstrap3.aspects.Visible.{B3HiddenOnlyCls, VisibleOnlyCls}

/**
  * Created by slovic on 29.01.16.
  */
object B3 {
  implicit class B3(val allClassNames: Seq[String]) extends B3Cls {

    /** Forces an element to be hidden OR if
      * returns hidden  OR  hidden-[MEDIA-QUERY].
      *
      * visible              -> "visible"
      * visible.md.block     -> "visible-md-block"
      * visible.md           -> "visible-md"
      * visible.md.inline.xs -> "visible-md-inline visible-xs"
      * */
    def visible = new VisibleOnlyCls("visible"::Nil)

    /** Forces an element to be hidden OR if
      * returns hidden  OR  hidden-[MEDIA-QUERY].
      *
      * hidden       -> "hidden"
      * hidden.md    -> "hidden-md"
      * hidden.md.xs -> "hidden-md hidden-xs"
      * */
    def hidden = new B3HiddenOnlyCls("hidden"::Nil)

    def col = new ColCls(Nil)

    def btn = new BtnCls("btn"::Nil)

    def glyphicon = Glyphicons

    def bg = new B3BackgroundCls(Nil)

    def text = new B3TextCls(Nil)

    /** Adds basic styling (light padding and only horizontal dividers) to any <table> */
    def table = new B3TablesCls("table"::Nil)

    def img = new B3ImageCls(Nil)

    def nav = new B3NavCls("nav"::Nil)

    def tab = new B3NavCls(Nil)

    def navbar = new B3NavbarCls(Nil)

    //DROPDOWN
    def dropdown = new DropdownCls(Nil)

    /** Indicates a dropup menu*/
    def dropup = append[B3]("dropup")

    /** Separates items inside the dropdown menu with a horizontal line*/
    def divider = append[B3]("divider")


    /** Floats an element to the left */
    def pullLeft = append[B3]("pull-left")
    /** Floats an element to the right */
    def pullRight = append[B3]("pull-right")

    /** Indicates new or unread items*/
    def badge = append[B3]("badge")

    def container = append[B3]("container")

    def containerFluid = append[B3]("container-fluid")

    /** Indicates a big box for calling extra attention to featured content or information*/
    def jumbotron = append[B3]("jumbotron")

    /** Sets an element to display:block with margin.right:auto and margin.left:auto*/
    def centerBlock = append[B3]("center-block")

    /** Clears floats*/
    def clearfix = append[B3]("clearfix")

    /** Forces an element to be shown*/
    def show = append[B3]("show")

    /** Hides an element to all devices except screen readers*/
    def srOnly = append[B3]("sr-only")

    /** Combine with .sr-only to show the element again when it is focused (e.g. by a keyboard.only user) */
    def srOnlyFocusable = append[B3]("sr-only-focusable")

    /** Helps replace an element's text content with a background image*/
    def textHide = append[B3]("text-hide")

    /** Indicates a close icon*/
    def close = append[B3]("close")

    /** Indicates dropdown functionality (will reverse automatically in dropup menus)*/
    def caret = append[B3]("caret")

    def iconBar = append[B3]("icon-bar")

    /** Makes a breadcrumb*/
    def breadcrumb = append[B3]("breadcrumb")

    /** Provides simple pagination links (Previous/Next)*/
    def pager = append[B3]("pager")

    /** Aligns the .pager previous button to the left*/
    def previous = append[B3]("previous")

    /** Aligns the .pager next button to the right*/
    def next = append[B3]("next")

    /** Provides pagination links*/
    def pagination = append[B3]("pagination")

    /*Used together with the .pagination class to provide larger pagination links*/
    def paginationLg = append[B3]("pagination.lg")

    /** Used together with the .pagination class to provide smaller pagination links*/
    def paginationSm = append[B3]("pagination.sm")

    /** Indicates an unclickable link, tab, btn ...*/
    def disabled = append[B3]("disabled")

    /** Indicates the current page */
    def active = append[B3]("active")

    def collapse = append[B3]("collapse")
  }
}


