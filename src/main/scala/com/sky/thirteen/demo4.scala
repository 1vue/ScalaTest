package com.sky.thirteen

object demo4 {

  class pair[T](val a:T,val b:T){}


  def main(args: Array[String]): Unit = {

    val p=new pair(1,5)
    println(p.a,p.b)

    val p2=new pair(1,"张三")
    println(p2.a,p2.b)

val p3=new pair[Int](2,9)
    println(p3.a,p3.b)
  }
}
