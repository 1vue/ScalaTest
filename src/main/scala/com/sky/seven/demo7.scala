package com.sky.seven

//不可变列表
object demo7 {
  def main(args: Array[String]): Unit = {

    val list =List(1,2,3,4)

    val list2=Nil

    val list3=(-2)::(-1)::Nil

    println(s"list${list}")

    println(s"list2${list2}")

    println(s"list3${list3}")

  }
}
