//install clang http://www.scala-native.org/en/latest/user/setup.html

// run with sbt  run nativeLink
name := "chineseCheckers"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

enablePlugins(ScalaNativePlugin)

scalaVersion := "2.11.12"

nativeMode := "release"

