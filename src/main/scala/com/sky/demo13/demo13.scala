package com.sky.demo13

//样例类
object demo13 {

  case class Person(name:String,var age:Int){

  }

  def main(args: Array[String]): Unit = {
    var p=new Person("张三",20)
    println(p.name,p.age)

 //   p.name="李四"          //对val修饰变量进行修改，报错
    p.age=21

    println(p.name,p.age)
  }

}
