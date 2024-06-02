package com.sky.demo12

object demo12_2 {

  trait Logger{

    def log(msg:String)

  }

  trait Warning{
    def warn(msg:String)
  }

  object ConsoleLogger extends Logger with Warning {

    override def log(msg: String): Unit = println(msg)

    override def warn(msg: String): Unit = println(msg)
  }

  def main(args: Array[String]): Unit = {

    ConsoleLogger.log("输出信息")
    ConsoleLogger.warn("警告")


  }

}
