package com.sky.fifteen

object demo9 {
  def main(args: Array[String]): Unit = {


    val map=Map("A"->1,"B"->2,"C"->3)

    map.foreach(println(_))

    println(map.filterKeys(_ == "B"))

  }
}
