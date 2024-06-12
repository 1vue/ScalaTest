package com.sky.fifteen

import scala.collection.mutable

object demo5 {
  def main(args: Array[String]): Unit = {

    val s1=mutable.Stack(1,2,3,4,5)


    println(s1)

    s1.push(6)
    println(s1)

    s1.pushAll(Seq(11,22,33))
    println(s1)

    println(s1.pop)

    s1.clear()

    println(s1)


  }
}
