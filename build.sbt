import Dependencies._

/* Global configuration */
lazy val root = (project in file(".")).settings(
    inThisBuild(
        List(
            organization := "io.trosa",
            scalaVersion := "2.12.2",
            version := "0.0.1"
        )),
    name := "houden",
    libraryDependencies ++= Seq(
        scalaTest % Test,
        cats
    )
)

/* Scala lang related */
scalacOptions += "-deprecation"
scalacOptions += "-feature"

/* Strict coverage needed */
coverageMinimum := 80
coverageFailOnMinimum := true

/* set documentation folder output */
target in Compile in doc := baseDirectory.value / "docs"

/* Enable microsites */
enablePlugins(MicrositesPlugin)
