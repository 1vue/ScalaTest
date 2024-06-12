package com.sky.forteen

import scala.collection.immutable.{HashSet, TreeSet}
import scala.collection.mutable

object demo12 {
  def main(args: Array[String]): Unit = {

    val list1=Iterable("A","B","C")

    println(list1.sameElements(Iterable("A", "B", "C")))
    println(list1.sameElements(Iterable("A", "C", "B")))


    val list2=Iterable("A","B","C","D")

    println(list2.sameElements(list1))

val hs=HashSet(1,4,3,2,5)
    println(hs)

    val ts=TreeSet(2,1,3)
    println(ts)

    println(hs.sameElements(ts))

  }
}
