package com.sky.demo12



//对象混入技术
object demo12_4 {

  trait Logger{

    def log(msg:String)=println(msg)

  }

  class User{

  }

  def main(args: Array[String]): Unit = {

    var u=new User with Logger

    u.log("12345678")

  }

}
