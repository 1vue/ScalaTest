package com.sky.demo12


//使用trait实现适配器模式
object demo12_5 {

  trait Play{
    def top()
    def mid()
    def adc()
    def support()
    def jungle()

  }

  abstract class Player extends Play {

     override def top(): Unit = {}

     override def mid(): Unit = {}

     override def adc(): Unit = {}

     override def support(): Unit = {}

     override def jungle(): Unit = {}
   }

  class GreenHand extends Player {

    override def support(): Unit = println("123")

    override def top(): Unit = println("1234")
  }

  def main(args: Array[String]): Unit = {
    var g=new GreenHand

    g.top()
    g.support()
    g.adc()
  }

}
