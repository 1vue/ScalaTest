package com.sky.demo11

object demo11 {

  class Person(){

    var name:String=_

    var age:Int=_
    def eat()={
      println("人要吃")
    }

  }

  class Teacher extends Person{

    override def eat(): Unit = {
      println("老师要吃")

    }
  }

  class Student extends Person{

    override def eat(): Unit = {
      println("学生要吃")

    }
  }

  def main(args: Array[String]): Unit = {
    var t=new Teacher
    t.eat()

    var s=new Student
    s.eat()
  }

}
