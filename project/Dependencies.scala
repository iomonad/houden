import sbt._

object Dependencies {

  /*
  	* Versions
  	* */

  lazy val testVersion = "3.0.1"
  lazy val catsVersion = "1.0.1"
  lazy val hammockVersion = "0.8.5"
  /*
  	* Dependencies
  	* */

  lazy val scalaTest = "org.scalatest" %% "scalatest" % testVersion
  lazy val cats      = "org.typelevel" %% "cats-core" % catsVersion
  lazy val hammock   = "com.pepegar" %% "hammock-core" % hammockVersion
}
