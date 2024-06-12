package com.sky.fifteen

import scala.collection.mutable

object demo6 {
  def main(args: Array[String]): Unit = {


    val s=mutable.ArrayStack(1,2,3,4,5)
    s.dup
    println(s)

println(s.pop)

    s.preserving({
      s.clear()
      println(s)
    })
    println(s)
  }
}
