package com.sky.demo9

object demo9 {

  class Person(var name:String="1",var age:Int=20){}

  object Person{
    def apply(name: String, age: Int): Person = new Person(name, age)
  }

  def main(args: Array[String]): Unit = {
    var p=Person("33",21)
    println(p.name,p.age)
  }

}
