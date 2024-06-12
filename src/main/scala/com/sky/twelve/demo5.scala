package com.sky.twelve

object demo5 {


  def main(args: Array[String]): Unit = {


    val myshop=(f1:String=>Unit)=>{

      println("1")
      f1("Hello")
      println("3")
    }

    myshop{
      (mes:String)=>{
        println(mes)
      }

    }

  }

}
