package com.sky.thirteen

object demo7 {

  class Person{}

  class Policeman extends Person{}

  class Superman extends Policeman{}

  def demo[T>:Policeman](array: Array[T])=println(array)


  def main(args: Array[String]): Unit = {

demo(Array(new Person()))
demo(Array(new Policeman()))

//    demo(Array(new Superman))          //不是Policeman的父类，会报错

  }
}
