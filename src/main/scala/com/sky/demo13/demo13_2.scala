package com.sky.demo13

//样例对象
object demo13_2 {

  trait Sex

  case object Male extends Sex

  case object Female extends Sex

  case class Person(name:String,Sex:Sex)

  def main(args: Array[String]): Unit = {
    val p= Person("张三", Male)
    println(p)
  }

}
