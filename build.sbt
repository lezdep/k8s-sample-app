
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

/*
val sharedSettings: Seq[Def.Setting[_]] = Defaults.coreDefaultSettings ++ Seq(
  organization := "org.lezdep",
  version := "0.1",
  scalaVersion := "2.11.8",
  resolvers ++= Seq(
    Resolver.mavenLocal,
    Resolver.typesafeRepo("releases"),
    Resolver.sonatypeRepo("releases"),
    Resolver.bintrayRepo("websudos", "oss-releases"),
    Resolver.jcenterRepo
  ),
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
  ),
  logLevel in ThisBuild := Level.Info,
  fork in Test := true,
  javaOptions in Test ++= Seq(
    "-Xmx1G",
    "-Djava.net.preferIPv4Stack=true",
    "-Dio.netty.resourceLeakDetection"
  ),
  libraryDependencies ++= Seq(
    "org.slf4j"           %  "slf4j-api"                    % "1.7.25"
  ),
  parallelExecution in ThisBuild := false
)

lazy val k8s-sample-app = (project in file("k8s-sample-app")).settings(
  sharedSettings: _*
).settings(
  crossScalaVersions := Seq("2.11.8", "2.12.1")
)
*/