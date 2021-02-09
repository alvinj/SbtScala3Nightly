lazy val root = project
  .in(file("."))
  .settings(
    name := "Scala3Nightly",
    description := "Lets me use the Scala 3 nightly build",
    version := "0.1.0",
    scalaVersion := dottyLatestNightlyBuild.get,
    useScala3doc := true,
  )

// SEE https://github.com/scala/scala3-example-project for details

