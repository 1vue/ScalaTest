package com.sky.demo11

object demo12 {

  class Person{
    var name:String=_
    var age:Int=_

val number:String="202113407046"
    def sayHello()={

      println("Hello")
    }

  }

class Student extends Person{

  override def sayHello(): Unit = {

    super.sayHello()
    println("sayYes")
  }

  override val number: String = "202113407047"

}

  def main(args: Array[String]): Unit = {
    var s=new Student
    s.sayHello()
  println( s.number)
  }
}
