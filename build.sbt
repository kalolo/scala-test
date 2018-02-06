name := "scala-test"

//mainClass in (Compile, run) := Some("Main")

version := "1.0"

scalaVersion := "2.12.1"
val sparkVersion = "2.2.1"

libraryDependencies ++= Seq {
  "org.scalatest" % "scalatest_2.12" % "3.0.4" % "test"
  //"org.apache.spark" % "spark-core_2.10" % sparkVersion
  //"org.apache.spark" % "spark-sql_2.10" % sparkVersion
}

//libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.4" % "test"
//libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.1"