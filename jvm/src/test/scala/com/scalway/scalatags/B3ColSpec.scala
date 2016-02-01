package com.scalway.scalatags

import org.scalatest.{WordSpec, MustMatchers}

class B3ColSpec extends WordSpec with MustMatchers {
  import b3._
  "'col' accept 4 screen dimension" in {
    (col xs 1 sm 1 md 2 lg 3).toString must {
      include ("col-xs-1") and
        include ("col-sm-1") and
        include ("col-md-2") and
        include ("col-lg-3")
    }
  }

  "'col' accept offset pull and push dimension" in {
    (col sm(1,offset=1) md(2, pull=2) lg(3, push=4)).toString must {
      include ("col-sm-offset-1") and
        include ("col-md-pull-2") and
        include ("col-lg-push-4")
    }
  }


  "glyphicon returns proper class" in {
    (glyphicon apple).toString must {
      include ("glyphicon-apple") and
        include ("glyphicon ")
    }
  }

  "b3.visible returns proper class" in {
    visible.toString mustBe "visible"
    visible.xs.inline.sm.inline.lg.inlineBlock.allClassNames
      .toString must {
      include ("visible-xs-inline") and
        include ("visible-sm")  and
        include ("visible-lg-inline-block")
    }
  }

  "b3.hidden returns proper class" in {
    hidden.toString mustBe ("hidden")

    hidden.md.xs.sm.lg.toString.split(" ") must {
      contain ("hidden-xs") and contain ("hidden-md")
      contain ("hidden-lg") and contain ("hidden-sm")
    }

    hidden.md.xs.sm.lg.toString.split(" ") must not contain ("hidden")

    "hidden.xs.inline" mustNot compile
  }

  "b3.btn returns proper class" in {
    btn.xs.toString must include ("btn-xs")
    "hidden.xs.inline" mustNot compile
  }

  "b3.navbar" in {
    navbar.default.fixedBottom.classes must {
      contain ("navbar") and
      contain ("navbar-default") and
      contain ("navbar-fixed-bottom")
    }

    navbar.btn.collapse.classes must {
      contain ("navbar-btn") and
      contain ("navbar-collapse") and
      not contain ("navbar")
    }
  }


}