
//Imports
import Common.seqBaseProjectTemplate
import Versions._
import sbt.Def

//Settings
object Settings {

  val rootSettings: Seq[Def.Setting[_]] = seqBaseProjectTemplate(rootVersion)
  val moduleASettings: Seq[Def.Setting[_]] = seqBaseProjectTemplate(moduleAVersion)
  val moduleBSettings: Seq[Def.Setting[_]] = seqBaseProjectTemplate(moduleBVersion)

}
