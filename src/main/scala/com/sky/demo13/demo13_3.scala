package com.sky.demo13

//计算器
object demo13_3 {


case class Calculate(a:Int,b:Int){

  def add()=a+b

  def sub()=a-b

  def div()=a/b

  def mul()=a*b

}

  def main(args: Array[String]): Unit = {

    val c=Calculate(10,3)
    println(s"加法：${c.add()}")
    println(s"减法：${c.sub()}")
    println(s"乘法：${c.mul()}")
    println(s"除法：${c.div()}")

  }



}
