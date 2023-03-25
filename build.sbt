import ai.kien.python.Python

ThisBuild / version      := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.1.3"

lazy val root = (project in file("."))
  .settings(
    name := "scala-py-sample",
    libraryDependencies ++= Seq(
      "dev.scalapy" %% "scalapy-core" % "0.5.3"
    ),
    fork := true,
    javaOptions ++= javaOpts
  )

lazy val python: Python = Python("./venv/bin/python")

lazy val javaOpts: Seq[String] = python.scalapyProperties.get.map { case (k, v) =>
  s"""-D$k=$v"""
}.toSeq
