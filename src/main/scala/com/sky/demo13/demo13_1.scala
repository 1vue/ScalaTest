package com.sky.demo13

//Case class的方法
object demo13_1 {

  case class Person(name:String,age:Int){

  }


  def main(args: Array[String]): Unit = {

    val p=Person("张三",23)

  println(p)
val p1=Person("张三",23)

    println(p1==p)

    val p2=p.copy()
    println(p2==p1)
    println(p1.hashCode()==p2.hashCode())

    println("重地".hashCode())
    println("通话".hashCode())
  }


}
