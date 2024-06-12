package com.sky.thirteen

import java.io.{BufferedWriter, FileWriter}
import scala.io.Source

object demo9 {
  def main(args: Array[String]): Unit = {

val source=Source.fromFile("src/main/scala/com/sky/thirteen/1.txt")

val list1:List[String]=source.mkString.split("\\s+").toList
  val list2:List[Int]= list1.map(_.toInt)

    val set1:Set[Int]=list2.toSet
val list3:List[Int]=set1.toList
    val list4=list3.sorted
//list4.foreach(println(_))

    val bw=new BufferedWriter(new FileWriter("src/main/scala/com/sky/thirteen/2.txt"))
    list4.foreach(
      x=>{
        bw.write(x.toString)
        bw.newLine()
      }
    )
    bw.close()
    source.close()

  }
}
