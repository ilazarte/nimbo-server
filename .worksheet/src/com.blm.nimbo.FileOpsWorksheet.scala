package com.blm.nimbo

import java.nio.file.Path
import java.nio.file.Paths

object FileOpsWorksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(135); 
  
  val path = Paths.get("D:/");System.out.println("""path  : java.nio.file.Path = """ + $show(path ));$skip(28); val res$0 = 
  
  path.toFile().exists();System.out.println("""res0: Boolean = """ + $show(res$0))}
  
  
}
