package com.sky.seven

object demo10 {
  def main(args: Array[String]): Unit = {

    val list=List(1,2,3,4)

    println(list.isEmpty)
    println(list.head)

    val list2=List(4,5,6)
    println(list2.tail)
    val list3=list ++ list2
    println(list3)

    println(list3.reverse)

    println(list3.take(2))

    println(list3.drop(4))

  }
}
