package com.sky.demo11

object demo1 {


  class Person(var name:String="zs"){


    def say()=println("1")
  }

  class Student extends Person(){
    override def say()=println("2")
  }

  def main(args: Array[String]): Unit = {
    var s:Person=new Student
    println(s.name)
    s.say()
  }

}
