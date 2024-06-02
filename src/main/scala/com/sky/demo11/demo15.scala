package com.sky.demo11


//抽象类的字段和方法重写
object demo15 {

  abstract class Person(){
    val occ:String
    def say()
  }

class Teacher extends Person{
  override val occ: String = "Teacher"

  override def say(): Unit = {
    println("I'm Teacher")
  }
}

  class Student extends Person{
    override val occ: String = "Student"

    override def say(): Unit = println("I'm Student")
  }

  def main(args: Array[String]): Unit = {

    var p=new Teacher
    println(p.occ)
    p.say()

    var s=new Student
    println(s.occ)
    s.say()

  }

}
