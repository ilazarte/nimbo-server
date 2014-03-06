package com.blm.nimbo

import scala.util.Random

trait DevData {

  case class Person(id: Int, name: String)
  
  def makeName = (Random.alphanumeric take 10).toList.mkString
	
  def makePersons(cnt: Int) = for (i <- 0 until cnt) yield Person(i, makeName)
}