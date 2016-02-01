lazy val scalatagsB3 = crossProject
  .crossType(CrossType.Full)
  .in(file("."))
  .settings(
    resolvers += Resolver.jcenterRepo,
    version := "0.0.2",
    organization := "com.scalway",
    name := "scalatags-b3",
    licenses += ("MIT", url("http://opensource.org/licenses/MIT")),
    javacOptions ++= Seq("-source", "1.6", "-target", "1.6"),
    scalaVersion := "2.10.6",
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

lazy val root = project.in(file("."))
  .aggregate(scalatagsB3js, scalatagsB3jvm)
