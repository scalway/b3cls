package com.scalway.b3cls.impl.abst

import B3Cls.CREATE

/**
  * Created by slovic on 29.01.16.
  */
trait B3StyledCls[STYLE_RET] extends Any with B3Cls {
  def className:String

  /** Indicates a default/standard button */
  def default(implicit c:CREATE[STYLE_RET]) = 	append[STYLE_RET](className+"-default")

  /** Provides extra visual weight and identifies the primary action in a set of buttons */
  def primary(implicit c:CREATE[STYLE_RET]) = 	append[STYLE_RET](className+"-primary")

  /** Indicates a successful or positive action */
  def success(implicit c:CREATE[STYLE_RET]) = 	append[STYLE_RET](className+"-success")

  /** Contextual button for informational alert messages */
  def info(implicit c:CREATE[STYLE_RET]) = 	append[STYLE_RET](className+"-info")

  /** Indicates caution should be taken with this action */
  def warning(implicit c:CREATE[STYLE_RET]) = 	append[STYLE_RET](className+"-warning")

  /** Indicates a dangerous or potentially negative action */
  def danger(implicit c:CREATE[STYLE_RET]) = 	append[STYLE_RET](className+"-danger")
}

