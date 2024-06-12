package com.sky.eleven

import com.sky.eleven.demo10.Student.unapply

object demo10 {

  class Student(val name:String,val age:Int){

  }

  object Student{

    def apply(name:String,age:Int)=new Student(name, age)

    def unapply(s:Student)={
      if(s==null)
        None
      else
        Some(s.name,s.age)

    }

  }

  def main(args: Array[String]): Unit = {

    val s=Student("张三",20)

    val res= unapply(s)
    println(res)

    s match {
      case Student(name,age) => println(s"name:${name},age:${age}")
      case _=>println("未匹配")
    }


  }

}
