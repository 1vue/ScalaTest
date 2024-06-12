package com.sky.thirteen

object demo5 {


  trait logger[T]{

    val a:T

    def show(msg:T)

  }



  object console extends logger [Int]{


    override val a: Int = 12

    override def show(msg: Int): Unit = println(msg)
  }


  def main(args: Array[String]): Unit = {

    println(console.a)
    console.show(12345)

  }
}
