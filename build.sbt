

lazy val scalatagsB3 = crossProject
  .crossType(CrossType.Full)
  .in(file("."))
  .settings(
    resolvers += Resolver.jcenterRepo,
    version := "0.0.4",
    organization := "com.scalway",
    name := "scalatags-b3",
    licenses += ("MIT", url("http://opensource.org/licenses/MIT")),
    javacOptions ++= Seq("-source", "1.6", "-target", "1.6"),
    scalaVersion := "2.11.7",
    crossScalaVersions := Seq("2.10.6", "2.11.7"),
    bintrayPackageLabels := Seq("scala", "scalatags", "bootstrap3", "twitter bootstrap"),
    bintrayVcsUrl := Some("git@github.com/scalway/scalatagsBootstrap3")
  ).jvmSettings(
    testFrameworks += TestFrameworks.ScalaTest,
    libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.1" % "test"
  ).jsSettings(
    requiresDOM := false
  )

val scalatagsB3js  = scalatagsB3 .js
val scalatagsB3jvm = scalatagsB3 .jvm

lazy val example = project.in(file("./example"))
  .settings(
    javacOptions ++= Seq("-source", "1.6", "-target", "1.6"),
    scalaVersion := "2.11.7",
    licenses += ("MIT", url("http://opensource.org/licenses/MIT")),
    organization := "com.scalway",
    name := "scalatags-b3-examples",
    mainClass in Compile := Some("com.scalway.scalatagsb3example.JSTutorialApp"),
    persistLauncher := true,
    sourceDirectories in Compile += baseDirectory.value / ".." / "shared",
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom"    % "0.8.0" withJavadoc() withSources(),
      "com.lihaoyi"  %%% "scalatags"      % "0.5.2" withJavadoc() withSources(),
      "be.doeraene"  %%% "scalajs-jquery" % "0.8.1" withJavadoc() withSources()
    )
  )
  .dependsOn(scalatagsB3js)
  .enablePlugins(ScalaJSPlugin)

lazy val root = project.in(file("."))
  .aggregate(scalatagsB3js, scalatagsB3jvm)
