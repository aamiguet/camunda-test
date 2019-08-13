import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "ch.aamiguet"
ThisBuild / organizationName := "aamiguet"

lazy val root = (project in file("."))
  .settings(
    name := "camunda-test",
    libraryDependencies += scalaTest % Test
  )

libraryDependencies ++= Seq(
  "org.camunda.bpm.extension.dmn.scala" % "dmn-engine" % "1.4.0",
  "ch.qos.logback" % "logback-classic" % "1.1.3"
)

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
