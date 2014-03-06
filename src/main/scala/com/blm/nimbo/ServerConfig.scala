package com.blm.nimbo

import java.io.File
import scala.util.Properties
import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory

trait ServerConfig {
  
  case class NimboConfig(
      mediadir: File, 
      transferdir: File)
  
  lazy val nimbo = {
    
    val homevar = Properties.envOrElse("HOME", "/home/nimbouser")
    val file = new File(homevar, ".nimbo/nimboserver.properties")
    val conf = ConfigFactory.parseFile(file)
    
    val mdir = new File(conf.getString("nimbo.mediadir"))
    val xdir = new File(conf.getString("nimbo.transferdir")) 
   
	NimboConfig(mdir, xdir)
  }
  
}