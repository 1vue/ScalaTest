package com.sky.forteen

object demo11 {
  def main(args: Array[String]): Unit = {

    val i1=Iterable("A","B","C","D","E")


val i2=i1.zipWithIndex

    println(i2)

    val i3=i2.map(x=>x._2->x._1)
    println(i3)

  }
}
