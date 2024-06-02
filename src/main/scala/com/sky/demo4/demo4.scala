package com.sky.demo4

object demo4 {
  def main(args: Array[String]): Unit = {

    var p1=new Person("李四",24)

    var p2=new Person()

    var p3=new Person(age=30)

    println(p1.name,p1.age)
    println(p2.name,p2.age)
    println(p3.name,p3.age)

  }
}
