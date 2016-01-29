package com.scalway.scalatags.b3.abst

import com.scalway.scalatags.b3.abst.B3Classes.CREATE

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
trait B3ComplexOrClasses extends Any with B3Classes {
  override protected def append[T](str: String)(implicit c: CREATE[T]): T = c(str :: Nil)
}

