package com.sky.forteen

object demo5 {
  def main(args: Array[String]): Unit = {
    val t=Traversable(1,2,3,4,5,6)

    println(t.head)

    println(t.headOption)

    println(t.last)
    println(t.lastOption)

    println(t.find(x => x % 2 == 0))

    val t2=t.slice(2,5)
    println(t2)

  }
}
