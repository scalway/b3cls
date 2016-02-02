package com.scalway.b3cls.impl.abst

import B3Cls.CREATE

/**
  * tricky way to make possible composition like that
  *
  * hidden       -> "hidden"
  * hidden.md    -> "hidden-md"
  * hidden.md.xs -> "hidden-md hidden-xs"
  *
  * when someone use only hidden then we want them.
  * If someone use e.g. media queries on that we want to throw away "hidden"
  * class and use only them from media queries.
  */
trait B3ComplexOrCls extends Any with B3Cls {
  override protected def append[T](str: String*)(implicit c: CREATE[T]): T = c(str ++: Nil)
}

