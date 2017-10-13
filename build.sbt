import sbtassembly.AssemblyPlugin.autoImport.assemblyMergeStrategy

name := "k8s-sample-app"

version := "0.1"

scalaVersion := "2.11.8"

lazy val Versions = new {
  val scala = "2.11.8"
}

crossScalaVersions := Seq("2.11.8", "2.12.1")

libraryDependencies ++= Seq(
  "org.scala-lang"      %  "scala-library"                % Versions.scala,
  "org.scala-lang"      %  "scala-reflect"                % Versions.scala
)

resolvers ++= Seq(
  Resolver.mavenLocal,
  Resolver.typesafeRepo("releases"),
  Resolver.sonatypeRepo("releases"),
  Resolver.bintrayRepo("websudos", "oss-releases"),
  Resolver.jcenterRepo
)

scalacOptions in ThisBuild ++= Seq(
  "-Xexperimental",
  "-language:experimental.macros",
  "-language:postfixOps",
  "-language:implicitConversions",
  "-language:reflectiveCalls",
  "-language:higherKinds",
  "-language:existentials",
  "-Xlint",
  "-deprecation",
  "-feature",
  "-unchecked"
)

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", "io.netty.versions.properties") => MergeStrategy.filterDistinctLines
  case PathList("log4j.properties") => MergeStrategy.first
  case x => val oldStrategy = (assemblyMergeStrategy in assembly).value; oldStrategy(x)
}

mainClass in assembly := Some("org.lezdep.k8s.sample.Main")
