package com.scalway.b3cls.example

import com.scalway.b3cls.impl.abst.B3Cls
import com.scalway.b3cls.b3

import org.scalajs.dom
import org.scalajs.dom.Element

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport
import scalatags.JsDom.all._
import scalatags.JsDom.tags2.nav
import scalatags.generic

/**
  * Created by slovic on 02.02.16.
  */
@JSExport
class JSTutorialApp extends JSApp {

  implicit def b3clsToModifier(b:B3Cls):generic.AttrPair[Element, String] = { cls := b.toString() }

  @JSExport
  def main(): Unit = {
    println("example scala.js launcher is running ...")
    dom.document.body.appendChild(view.render)
  }


  def view = nav( b3.navbar.default, //cls:="navbar navbar-default",
    div( b3.containerFluid,
      div( b3.navbar.header, //cls:="navbar-header",
        button(
          b3.navbar.toggle ++ "collapsed",//cls:="navbar-toggle collapsed",
          tpe:="button",
          data.toggle:="collapse", data.target:="#navbar", aria.expanded:="false", aria.controls:="navbar",
          span( b3.srOnly, "Toggle navigation"),
          span( b3.iconBar ),
          span( b3.iconBar ),
          span( b3.iconBar )
        ),
        a(
          b3.navbar.brand,
          href:="#","Project name"
        )
      ),
      div( b3.navbar.collapse ++ b3.collapse, //cls:="navbar-collapse collapse",
        id:="navbar",
        ul( b3.nav ++ b3.navbar.nav, //cls:="nav navbar-nav",
          li( b3.active, //cls:="active",
            a( href:="#","Home")),
          li(a( href:="#","About")),
          li(a( href:="#","Contact")),
          li( b3.dropdown,//cls:="dropdown",
            a( href:="#",
              cls:="dropdown-toggle",
              //b3.dropdown.toggle,
              data.toggle:="dropdown",
              role:="button",
              aria.haspopup:="true",
              aria.expanded:="false",
              "Dropdown" ,
              span( cls:="caret")),
            ul( b3.dropdown.menu,
              li(a( href:="#","Action")),
              li(a( href:="#","Another action")),
              li(a( href:="#","Something else here")),
              li( role:="separator", cls:="divider"),
              li( b3.dropdown.header ,"Nav header"),
              li(a( href:="#","Separated link")),
              li(a( href:="#","One more separated link"))
            )
          )
        ),
        ul( b3.nav ++ b3.navbar.nav.right, //cls:="nav navbar-nav navbar-right",
          li( b3.active ,a( href:="./","Default" ,span( b3.srOnly,"(current)")))
        )
      )
    )
  )
}
