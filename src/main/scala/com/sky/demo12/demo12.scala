package com.sky.demo12

object demo12 {

  trait Logger{

    def log(msg:String)

  }

  class ConsoleLogger extends Logger{

    override def log(msg: String): Unit = println(msg)

  }

  def main(args: Array[String]): Unit = {

    var c=new ConsoleLogger

    c.log("Hello")

  }

}
