# scalatagsBootstrap3

I created this project to test the DSL implementation idea based on value classes. 
I'm not sure if it'll be useful for someone. It's not production ready and is not fully implemented.

how to use it
------------------------------------------------------
You can use it in scalaJs and normal scala projects.
in build.sbt add:
```
resolvers += "scalway bintray repo" at "http://dl.bintray.com/scalway/maven"

libraryDependencies += "com.scalway" %%% "b3cls" % "0.0.4"
```

What does is do
------------------------------------------------------

I mapped twitter-bootstrap 3.x classes into typesafe structure. To use it just 

```
import com.scalway.b3cls.b3
```

and then use it like that:

```
//operator syntax
b3.col xs (10, pull=2) sm 8 md 8 lg (6, offset=2)

//functional syntax
b3.col.xs(10, pull=2).sm(8).md(8).lg(6, offset=2)
```

and it'll produce string like that:

```
"col-xs-10 col-xs-pull-2 col-sm-8 col-md-8 col-lg-6 col-lg-offset-2"
```

we support also other bootstrap classes (but still not all). 
col and "visible" "hidden" are most useful. other stuff is still experimental and can be changed anytime.