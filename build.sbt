

lazy val b3cls = crossProject
  .crossType(CrossType.Full)
  .in(file("."))
  .settings(
    resolvers += Resolver.jcenterRepo,
    version := "0.0.4",
    organization := "com.scalway",
    name := "b3cls",
    licenses += ("MIT", url("http://opensource.org/licenses/MIT")),
    javacOptions ++= Seq("-source", "1.6", "-target", "1.6"),
    scalaVersion := "2.11.7",
    crossScalaVersions := Seq("2.10.6", "2.11.7"),
    bintrayPackageLabels := Seq("scala", "scalatags", "bootstrap3", "twitter bootstrap"),
    bintrayVcsUrl := Some("git@github.com/scalway/b3cls")
  ).jvmSettings(
    testFrameworks += TestFrameworks.ScalaTest,
    libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.1" % "test"
  ).jsSettings(
    requiresDOM := false
  )

val b3js  = b3cls .js
val b3jvm = b3cls .jvm

lazy val example = project.in(file("./example"))
  .settings(
    javacOptions ++= Seq("-source", "1.6", "-target", "1.6"),
    scalaVersion := "2.11.7",
    licenses += ("MIT", url("http://opensource.org/licenses/MIT")),
    organization := "com.scalway",
    name := "b3cls-example",
    mainClass in Compile := Some("com.scalway.b3cls.example.JSTutorialApp"),
    persistLauncher := true,
    sourceDirectories in Compile += baseDirectory.value / ".." / "shared",
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom"    % "0.8.0" withJavadoc() withSources(),
      "com.lihaoyi"  %%% "scalatags"      % "0.5.2" withJavadoc() withSources(),
      "be.doeraene"  %%% "scalajs-jquery" % "0.8.1" withJavadoc() withSources()
    )
  )
  .dependsOn(b3js)
  .enablePlugins(ScalaJSPlugin)

lazy val root = project.in(file("."))
  .aggregate(b3js, b3jvm)
