
//Imports
import Settings._
import Dependencies._
import Docker._
import ModuleNames._
import Resolvers.allResolvers

//Sbt Log Level
logLevel := Level.Info

//Add all the command alias's
CommandAlias.allCommandAlias

lazy val scalaprojecttemplate = (project in file("."))
  .settings(rootSettings: _*)
  .settings(libraryDependencies ++= rootDependencies)
  //.enablePlugins(Artifactory)
  .settings(rootDockerSettings)
  .enablePlugins(AshScriptPlugin)
  .enablePlugins(AssemblyPlugin)
  .settings(allResolvers: _*)

lazy val moduleatemplate = (project in file(moduleAKey))
  .settings(moduleASettings: _*)
  .settings(libraryDependencies ++= moduleADependencies)
  //.enablePlugins(Artifactory)
  .settings(moduleADockerSettings)
  .enablePlugins(AshScriptPlugin)
  .enablePlugins(AssemblyPlugin)

lazy val modulebtemplate = (project in file(moduleBKey))
  .settings(moduleBSettings: _*)
  .settings(libraryDependencies ++= moduleBDependencies)
  //.enablePlugins(Artifactory)
  .settings(moduleBDockerSettings)
  .enablePlugins(AshScriptPlugin)
  .enablePlugins(AssemblyPlugin)
