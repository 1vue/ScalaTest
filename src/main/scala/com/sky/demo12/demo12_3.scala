package com.sky.demo12

object demo12_3 {

  trait Hero{

    var name:String=_

    var arms:String

    def eat()=println("吃")

    def toWar()

  }

  class Generals extends Hero{


    override var arms: String = "刀"

    override def toWar(): Unit = println(s"${name}带${arms}上阵")



  }

  def main(args: Array[String]): Unit = {
    var g=new Generals
    g.eat()
    g.toWar()
  }

}
