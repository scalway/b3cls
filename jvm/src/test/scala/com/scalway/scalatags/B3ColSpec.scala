package com.scalway.scalatags

import org.scalatest.{WordSpec, MustMatchers}

class B3ColSpec extends WordSpec with MustMatchers {
  import b3._
  "'col' accept 4 screen dimension" in {
    (col xs 1 sm 1 md 2 lg 3).str must {
      include ("col-xs-1") and
        include ("col-sm-1") and
        include ("col-md-2") and
        include ("col-lg-3")
    }
  }

  "'col' accept offset pull and push dimension" in {
    (col sm(1,offset=1) md(2, pull=2) lg(3, push=4)).str must {
      include ("col-sm-offset-1") and
        include ("col-md-pull-2") and
        include ("col-lg-push-4")
    }
  }


  "glyphicon returns proper class" in {
    (glyphicon apple).str must {
      include ("glyphicon-apple") and
        include ("glyphicon ")
    }
  }

  "b3.visible returns proper class" in {
    visible.str mustBe "visible"
    visible.xs.inline.sm.lg.inlineBlock.str must {
      include ("visible-xs-inline") and
      include ("visible-sm")  and
      include ("visible-lg-inline-block")
    }
  }

  "b3.hidden returns proper class" in {
    hidden.str mustBe ("hidden")

    hidden.md.xs.sm.lg.str.split(" ") must {
      contain ("hidden-xs") and contain ("hidden-md")
      contain ("hidden-lg") and contain ("hidden-sm")
    }

    hidden.md.xs.sm.lg.str.split(" ") must not contain ("hidden")

    "hidden.xs.inline" mustNot compile
  }

  "b3.btn returns proper class" in {
    btn.xs.str must include ("btn-xs")
    "hidden.xs.inline" mustNot compile
  }


}