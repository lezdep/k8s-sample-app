logLevel := Level.Warn

/*
def websudosPattern = {
  val pList = List("[organisation]/[module](_[scalaVersion])(_[sbtVersion])/[revision]/[artifact]-[revision](-[classifier]).[ext]")
  Patterns(pList, pList, true)
}

resolvers ++= Seq(
  Resolver.url("Maven ivy Websudos", url(Resolver.DefaultMavenRepositoryRoot))(websudosPattern)
)

addSbtPlugin("com.cavorite" % "sbt-avro-1-7" % "1.1.2")

addSbtPlugin("com.websudos" %% "phantom-sbt" % "1.27.0")
*/

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.4")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.2")

addSbtPlugin("com.eed3si9n" % "sbt-doge" % "0.1.5")

//addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.8.5")

//addSbtPlugin("com.websudos" % "sbt-package-dist" % "1.2.0")
