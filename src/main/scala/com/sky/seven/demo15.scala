package com.sky.seven

//不可变集
object demo15 {

  def main(args: Array[String]): Unit = {

    val set=Set[Int]()

    val set2=Set(1,1,3,2,4,8)

    println(set)

    println(set2)

    println(set.size)
  }


}
