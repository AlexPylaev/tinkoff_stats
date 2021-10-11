val scala3Version = "3.0.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "tinkoff_stats",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    resolvers += Resolver.mavenLocal,
    
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",
    libraryDependencies += "org.reactivestreams" % "reactive-streams" % "1.0.3",
    libraryDependencies += "ru.tinkoff.invest" % "openapi-java-sdk-java8" % "0.6-SNAPSHOT"
  )
