package com.scalway.scalatags

import com.scalway.scalatags.bootstrap3.abst.B3Cls
import com.scalway.scalatags.bootstrap3.aspects.Dropdown.DropdownCls
import com.scalway.scalatags.bootstrap3.aspects.Grid.ColCls
import com.scalway.scalatags.bootstrap3.aspects.Img.B3ImageCls
import com.scalway.scalatags.bootstrap3.aspects.Nav.B3NavCls
import com.scalway.scalatags.bootstrap3.aspects.Navbar.{B3NavbarCls, B3NavbarHelpersCls}
import com.scalway.scalatags.bootstrap3.aspects.Tables.B3TablesCls
import com.scalway.scalatags.bootstrap3.aspects.Text.{B3TextCls, B3BackgroundCls}
import com.scalway.scalatags.bootstrap3.aspects.Glyphicons
import com.scalway.scalatags.bootstrap3.aspects.Visible._
import com.scalway.scalatags.bootstrap3.aspects.Btn._

/**
  * Created by slovic on 29.01.16.
  */
package object b3 extends B3Cls {

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
  def dropup = apply("dropup")

  /** Separates items inside the dropdown menu with a horizontal line*/
  def divider = apply("divider")


  /** Floats an element to the left */
  def pullLeft = apply("pull-left")
  /** Floats an element to the right */
  def pullRight = apply("pull-right")

  /** Indicates new or unread items*/
  def badge = apply("badge")

  /** Indicates a big box for calling extra attention to featured content or information*/
  def jumbotron = apply("jumbotron")

  /** Sets an element to display:block with margin.right:auto and margin.left:auto*/
  def centerBlock = apply("center-block")

  /** Clears floats*/
  def clearfix = apply("clearfix")

  /** Forces an element to be shown*/
  def show = apply("show")

  /** Hides an element to all devices except screen readers*/
  def srOnly = apply("sr-only")

  /** Combine with .sr-only to show the element again when it is focused (e.g. by a keyboard.only user) */
  def srOnlyFocusable = apply("sr-only-focusable")

  /** Helps replace an element's text content with a background image*/
  def textHide = apply("text-hide")

  /** Indicates a close icon*/
  def close = apply("close")

  /** Indicates dropdown functionality (will reverse automatically in dropup menus)*/
  def caret = apply("caret")



  /** Makes a breadcrumb*/
  def breadcrumb = apply("breadcrumb")

  /** Provides simple pagination links (Previous/Next)*/
  def pager = apply("pager")

  /** Aligns the .pager previous button to the left*/
  def previous = apply("previous")

  /** Aligns the .pager next button to the right*/
  def next = apply("next")

  /** Provides pagination links*/
  def pagination = apply("pagination")

  /*Used together with the .pagination class to provide larger pagination links*/
  def paginationLg = apply("pagination.lg")

  /** Used together with the .pagination class to provide smaller pagination links*/
  def paginationSm = apply("pagination.sm")

  /** Indicates an unclickable link, tab, btn ...*/
  def disabled = apply("disabled")

  /** Indicates the current page */
  def active = apply("active")

  override protected val allClassNames: Seq[String] = Nil
}
