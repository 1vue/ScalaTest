package com.sky.forteen

object demo6 {
  def main(args: Array[String]): Unit = {
    val t= Traversable(1,2,3,4,5,6)

    println(t.forall(_ % 2 == 0))

    println(t.exists(_ % 2 == 0))


  }
}
