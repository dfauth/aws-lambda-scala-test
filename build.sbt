name := "aws-lambda-scala-test"

version := "0.1"

scalaVersion := "2.12.6"

samStage := "dev"

resolvers += Resolver.jcenterRepo
resolvers += Resolver.bintrayRepo("dnvriend", "maven")

libraryDependencies += "com.github.dnvriend" %% "sam-annotations" % "1.0.30"
libraryDependencies += "com.github.dnvriend" %% "sam-lambda" % "1.0.30"