package com.sky.fifteen

object demo4 {
  def main(args: Array[String]): Unit = {

val s=(1 to 5).toSeq
    println(s)
    val s1=s.updated(2,10)

    println(s1)

    val s2=s.patch(1,Seq(10,20),3)
    println(s2)

  }
}
