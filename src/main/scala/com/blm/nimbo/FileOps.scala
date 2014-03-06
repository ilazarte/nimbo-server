package com.blm.nimbo

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.CopyOption
import java.nio.file.StandardCopyOption

trait FileOps {
  
  /**
   * Move the path from one directory to another in an atomic manner.
   */
  def move(from: Path, to:Path) = Files.move(from, to, StandardCopyOption.ATOMIC_MOVE)
}