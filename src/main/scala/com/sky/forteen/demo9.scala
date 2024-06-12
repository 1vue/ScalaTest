package com.sky.forteen

object demo9 {
  def main(args: Array[String]): Unit = {


    val list=List(1,2,3,4,5)


   val it= list.iterator

    while (it.hasNext){

      println(it.next())
    }

    list.foreach(println(_))
  }
}
