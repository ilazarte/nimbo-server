package com.blm.nimbo

import java.io.File
import java.util.ResourceBundle

import scala.util.Properties

class NimboServlet extends NimboServerStack with ServerConfig with DevData {

  get("/") {
    
    println("media dir: " + this.nimbo.mediadir.getAbsolutePath())
    println("transfer dir: " + this.nimbo.transferdir.getAbsolutePath())
    
    main(this.makePersons(10))
  }
  
  def main(list: Seq[Person]) =
    <html>
      <body>
        <h1>Hello, world people!</h1>
        {table (list)}
      </body>
    </html>
      
  def table(persons: Seq[Person]) = 
    <table>
  	{for 
	  (p <- persons) 
  	  yield 
	  <tr>
	  	<td>{p.id}</td>
  		<td>{p.name}</td></tr>}
  	</table>
    
  get("/transfer") {
    
    
    
	<html>
      <body>
        <h1>Resources demo</h1>
        {}
      </body>
    </html>
  }
}
