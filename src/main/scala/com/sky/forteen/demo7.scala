package com.sky.forteen

object demo7 {
  def main(args: Array[String]): Unit = {

    val t=Traversable(1,2,3,4,5,6)

    println(t.count(_ % 2 != 0))

    println(t.sum)
    println(t.product)
    println(t.max)
    println(t.min)


  }
}
