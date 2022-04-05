version := "lab05"

scalaVersion := "3.1.1"

lazy val root = (project in file("."))
  .settings(
    name := "session05"
  )

scalacOptions ++= Seq("-source:future", "-indent", "-rewrite")

libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.11"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.11" % "test"