package com.sky.demo11

object demo14 {

  class Person{}

  class Student extends Person{

  }

  def main(args: Array[String]): Unit = {

    val p:Person=new Student

    println(p.isInstanceOf[Student])
    println(p.isInstanceOf[Person])
    println(p.getClass==classOf[Student])
    println(p.getClass==classOf[Person])




  }


}
