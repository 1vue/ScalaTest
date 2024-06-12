package com.sky.fifteen

object demo1 {
  def main(args: Array[String]): Unit = {

val s=Seq(1,2,3,4,5)
    val s1=(1 to 5).toSeq

    println(s,s1)
    println(s.size,s(2))
  }
}
