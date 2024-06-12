package com.sky.fifteen

object demo2 {
  def main(args: Array[String]): Unit = {

    val s=Seq(1,2,4,6,4,3,2)

    println(s.indexOf(2))
    println(s.lastIndexOf(2))

    println(s.indexWhere(x => x < 5  && x%2 == 0,3))
    println(s.lastIndexWhere(x => x < 5 && x % 2 == 0))

    println(s.indexOfSlice(Seq(4,6)))

    println(s.indexOfSlice(Seq(1, 2), 3))

  }
}
