package com.sky.fifteen

object demo3 {
  def main(args: Array[String]): Unit = {

    val s=(1 to 10).toSeq

    println(s.startsWith(Seq(1, 2)))
    println(s.startsWith(Seq(1, 3)))

    println(s.endsWith(Seq(8, 9)))
    println(s.endsWith(Seq(9, 10)))

    println(s.contains(3))

    println(s.containsSlice(Seq(1, 2)))
    println(s.containsSlice(Seq(1, 3)))


  }
}
