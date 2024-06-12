package com.sky.thirteen

import com.sky.thirteen.demo6.Student

object demo6 {

  class Person{}
  class Student extends Person{}

  def demo[T<:Student]( array: Array[T])={println(array)}

  def main(args: Array[String]): Unit = {

demo(Array(new Student,new Student))
//demo(Array(new Person,new Person))
//demo(Array("12","34"))

  }
}
