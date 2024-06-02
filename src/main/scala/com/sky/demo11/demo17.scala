package com.sky.demo11

object demo17 {

  abstract class Animal(){
    var name:String=""
    var age:Int=0

    def run()

    def eat()

  }

  class Cat extends Animal(){

    override def eat(): Unit = println("猫吃鱼")

    override def run(): Unit = println("1")

    def action()=println("抓老鼠")
  }

  class Dog extends Animal(){

    override def eat(): Unit = println("狗吃骨头")

    override def run(): Unit = println("2")

    def action2()=println("狗抓猫")
  }

  def main(args: Array[String]): Unit = {
    var c=new Cat
    c.name="猫"
    c.age=1
    println(c.name,c.age)
    c.eat()
    c.run()
    c.action()

    var d=new Dog
    d.name="狗"
    d.age=2
    println(d.name,d.age)
    d.eat()
    d.run()
    d.action2()

  }
}
