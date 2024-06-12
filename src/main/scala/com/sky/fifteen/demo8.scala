package com.sky.fifteen

import scala.collection.mutable

object demo8 {
  def main(args: Array[String]): Unit = {


    val s=mutable.SortedSet(1,4,3,2,5)

    println(s)

    val s1=mutable.HashSet(1,4,3,2,5)
    println(s1)

    val s2=mutable.LinkedHashSet(1,4,3,2,5)
    println(s2)


  }
}
