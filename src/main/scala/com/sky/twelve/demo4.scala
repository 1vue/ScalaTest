package com.sky.twelve

object demo4 {
  def main(args: Array[String]): Unit = {

    val myshop=(f1:()=>Unit)=>{

      println("Welcome")

      f1()

      println("Thanks for coming")

    }

myshop(()=>{

  println("123")
})

  }
}
