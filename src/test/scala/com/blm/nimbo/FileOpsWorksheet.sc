package com.blm.nimbo

import java.nio.file.Path
import java.nio.file.Paths

object FileOpsWorksheet {
  
  val path = Paths.get("D:/")                     //> path  : java.nio.file.Path = D:\
  
  path.toFile().exists()                          //> res0: Boolean = true
  
  
}