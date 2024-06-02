package com.sky.demo11

object demo16 {

  abstract class Person(){
  def say()
  }

  def show(p:Person)=p.say()

  def main(args: Array[String]): Unit = {

    new Person {
      override def say(): Unit = println("匿名内部类")
    }.say()

    var p=new Person {
      override def say(): Unit = println("YES")
    }

    show(p)

  }




}
