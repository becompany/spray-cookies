import scalariform.formatter.preferences._

organization:="name.martijnhoekstra"

name:="spray-cookies"

version:="0.1-SNAPSHOT"

scalaVersion:="2.11.7"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard"
)

libraryDependencies ++= Seq(
  "io.spray" %% "spray-client" % "1.3.1",
  "io.spray" %%  "spray-json" % "1.3.2",
  "com.typesafe.akka" %% "akka-actor" % "2.4.1",
  "org.scalacheck" %% "scalacheck" % "1.11.3" % "test"
)

scalariformSettings

ScalariformKeys.preferences := ScalariformKeys.preferences.value
  .setPreference(RewriteArrowSymbols, true)
  .setPreference(AlignParameters, true)
  .setPreference(AlignSingleLineCaseStatements, true)
