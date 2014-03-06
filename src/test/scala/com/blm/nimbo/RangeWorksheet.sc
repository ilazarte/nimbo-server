package com.blm.nimbo


import scala.util.Random

object RangeWorksheet {
	
	def fakename = (Random.alphanumeric take 10).toList.mkString
                                                  //> fakename: => String
	
	case class Person(id: Int, name: String)
	
	val persons = for (i <- 0 until 10) yield Person(i, fakename)
                                                  //> persons  : scala.collection.immutable.IndexedSeq[com.blm.nimbo.RangeWorkshee
                                                  //| t.Person] = Vector(Person(0,2DYMjzyI7J), Person(1,yzdPLJxmkr), Person(2,OWRv
                                                  //| ofR16g), Person(3,Um6CkgwqEx), Person(4,GPApLc0lUx), Person(5,XGE5wM5ddH), P
                                                  //| erson(6,0agUbsK05e), Person(7,XUNukRMZEo), Person(8,SLx4KDow47), Person(9,7R
                                                  //| zHuopyLJ))
	  def people(persons: List[Person]) =
    <tr>
  	{for (p <- persons) yield <td>p.id</td><td>p.name</td>}
  	</tr>                                     //> people: (persons: List[com.blm.nimbo.RangeWorksheet.Person])scala.xml.Elem
}