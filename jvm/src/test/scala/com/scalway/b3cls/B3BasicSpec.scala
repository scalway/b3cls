package com.scalway.b3cls

import org.scalatest.{WordSpec, MustMatchers}

class B3BasicSpec extends WordSpec with MustMatchers {
  import b3._
  //______________________________________________________________

  "'b3.col" should {
    "accept 4 screen dimension" in {
      (col xs 1 sm 1 md 2 lg 3).classes must contain theSameElementsAs Seq("col-xs-1", "col-sm-1", "col-md-2", "col-lg-3")
    }

    "accept offset pull and push dimension" in {
      (col sm(1,offset=1) md(2, pull=2) lg(3, push=4)).classes must contain theSameElementsAs
        Seq("col-sm-1", "col-sm-offset-1", "col-md-2", "col-md-pull-2", "col-lg-3", "col-lg-push-4")
    }
  }

  //______________________________________________________________


  "b3.glyphicon" should {
    "create at least one icon" in {
      (glyphicon.apple).classes must contain theSameElementsAs
        Seq("glyphicon-apple", "glyphicon")
    }

    "create more icons if needed" in pending
  }

  //______________________________________________________________

  "b3.visible" when {
    "nothing more is added" should {
      "have just value 'visible'" in {
        visible.toString mustBe "visible"
      }
    }

    "more actions are called on it" should {
      "have possibility to create xs/sm or lg" in {
        visible.xs.sm.lg.classes must contain theSameElementsAs
          Seq("visible-xs", "visible-sm", "visible-lg")
      }

      "have posibility to create inline/inline-block/block items" in {
        visible.xs.inline.sm.lg.inlineBlock.classes must contain theSameElementsAs
          Seq("visible-xs-inline", "visible-sm", "visible-lg-inline-block")
      }
    }
  }

  //______________________________________________________________

  "b3.hidden" should {
    "be presented as pure value" in hidden.toString.mustBe("hidden")

    "support media query tags" in {
      hidden.md.xs.sm.lg.classes must contain theSameElementsAs
        Seq("hidden-xs", "hidden-md", "hidden-lg", "hidden-sm")
    }

    "dosn't allow for call inline on it" in {"hidden.xs.inline" mustNot compile} //why we test it?
  }

  //______________________________________________________________

  "b3.btn" should {
    "returns proper class" in {
      btn.xs.toString must include ("btn-xs")
    }
  }
  //______________________________________________________________

  "b3.img" should {
    "create img rounded/thumbnail" in {
      img.thumbnail.rounded.classes must contain theSameElementsAs Seq("img-thumbnail", "img-rounded")
    }
  }

  //______________________________________________________________

  "b3.navbar" should {
    "create navbar classes" in {
      navbar.inverse.fixedTop.classes must contain theSameElementsAs Seq("navbar","navbar-inverse","navbar-fixed-top")
      navbar.default.fixedBottom.classes must contain theSameElementsAs Seq("navbar", "navbar-default", "navbar-fixed-bottom")
    }

    "create navbar helper classes" in { //for heplers emelents there is no "navbars"
      navbar.btn.collapse.classes must contain theSameElementsAs Seq("navbar-btn", "navbar-collapse")
    }

    "not mix navbar and navbar helper classes" in {
      "navbar.btn.default" mustNot compile
      "navbar.default.btn" mustNot compile
    }

  }

  //______________________________________________________________

}