package com.blm.nimbo


import scala.util.Random

object RangeWorksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(137); 
	
	def fakename = (Random.alphanumeric take 10).toList.mkString
	
	case class Person(id: Int, name: String);System.out.println("""fakename: => String""");$skip(109); 
	
	val persons = for (i <- 0 until 10) yield Person(i, fakename);System.out.println("""persons  : scala.collection.immutable.IndexedSeq[com.blm.nimbo.RangeWorksheet.Person] = """ + $show(persons ));$skip(116); 
	  def people(persons: List[Person]) =
    <tr>
  	{for (p <- persons) yield <td>p.id</td><td>p.name</td>}
  	</tr>;System.out.println("""people: (persons: List[com.blm.nimbo.RangeWorksheet.Person])scala.xml.Elem""")}
}
