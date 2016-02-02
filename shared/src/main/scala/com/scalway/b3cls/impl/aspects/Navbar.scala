package com.scalway.b3cls.impl.aspects

import com.scalway.b3cls.impl.abst.B3Cls

/**
  * Created by slovic on 29.01.16.
  */
object Navbar {

  implicit class B3NavbarCls(val allClassNames:Seq[String]) extends AnyVal
    with B3Cls
    with B3NavbarHelpersCls
    with NavbarNavbarCls {
//    override def className: String = "navbar"
  }

  trait B3NavbarHelpersCls extends Any with B3Cls {
    private def appendPost[T](postfix:String) = append[B3NavbarHelpersCls]("navbar-"+postfix)
    //addons (we put it somewhere else)
    def nav      = appendPost("nav")
    def form     = appendPost("form")
    def btn      = appendPost("btn")
    def text     = appendPost("text")
    def link     = appendPost("link")
    def brand    = appendPost("brand")
    def toggle   = appendPost("toggle") //+collapsed
    def right    = appendPost("right")
    def header   = appendPost("header")
    def collapse = appendPost("collapse")
  }

  trait NavbarNavbarCls extends Any with B3Cls {
    private def appendPost[T](postfix:String) = append[NavbarNavbarCls]("navbar", "navbar-"+postfix)
    //navbar builder
    def default = appendPost("default")
    def inverse = appendPost("inverse")
    def staticTop = appendPost("static-top")
    def fixedTop = appendPost("fixed-top")
    def fixedBottom = appendPost("fixed-bottom")
  }



}

