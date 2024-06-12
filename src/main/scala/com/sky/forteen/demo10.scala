package com.sky.forteen

object demo10 {
  def main(args: Array[String]): Unit = {

    val list=(1 to 11).toIterable

   val it=list.grouped(5)

    while (it.hasNext){
      println(it.next())
    }

  }
}
