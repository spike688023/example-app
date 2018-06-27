name := """example-app"""

version := "1.2-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

enablePlugins(DebianPlugin)
maintainer := "Spike"
packageSummary := "My custom package"
packageDescription := "Package"
