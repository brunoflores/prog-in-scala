ThisBuild / scalaVersion := "3.1.3"
ThisBuild / organization := "com.example"

val scalaTest = "org.scalatest" %% "scalatest" % "3.2.12"

lazy val hello = (project in file("."))
  .settings(
    name := "Hello",
    libraryDependencies += scalaTest % Test
  )
