
//Imports
import Settings._
import Dependencies._
import Docker._
import ModuleNames._

//Sbt Log Level
logLevel := Level.Info

//Add all the command alias's
CommandAlias.allCommandAlias

lazy val scalaprojecttemplate = (project in file("."))
  .settings(rootSettings: _*)
  .settings(libraryDependencies ++= rootDependencies)
  //.enablePlugins(Artifactory)
  //.enablePlugins(SonaType)
  .settings(rootDockerSettings)
  .enablePlugins(AshScriptPlugin)
  .enablePlugins(AssemblyPlugin)

lazy val moduleatemplate = (project in file(moduleAKey))
  .settings(moduleASettings: _*)
  .settings(libraryDependencies ++= moduleADependencies)
  //.enablePlugins(Artifactory)
  //.enablePlugins(SonaType)
  .settings(moduleADockerSettings)
  .enablePlugins(AshScriptPlugin)
  .enablePlugins(AssemblyPlugin)

lazy val modulebtemplate = (project in file(moduleBKey))
  .settings(moduleBSettings: _*)
  .settings(libraryDependencies ++= moduleBDependencies)
  //.enablePlugins(Artifactory)
  //.enablePlugins(SonaType)
  .settings(moduleBDockerSettings)
  .enablePlugins(AshScriptPlugin)
  .enablePlugins(AssemblyPlugin)
