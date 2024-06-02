package com.sky.demo11

object demo13 {

  class Person{

  }

  class Student extends Person{

    def say()=println("123")

  }

  def main(args: Array[String]): Unit = {

    val s: Person = new Student

    if(s.isInstanceOf[Student]){
      val p: Student = s.asInstanceOf[Student]
p.say()
    }


  }


}
