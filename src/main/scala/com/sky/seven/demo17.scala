package com.sky.seven


import scala.collection.mutable.Set

object demo17 {


  def main(args: Array[String]): Unit = {

    val set=Set(1,2,3,4)

    println(set)

    set+=5
    println(set)
    set++=List(7,8,9)
    println(set)

    set--=List(1,2)
    println(set)

  }


}
