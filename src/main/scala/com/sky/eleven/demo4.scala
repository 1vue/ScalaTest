package com.sky.eleven

object demo4 {



  def divide(a:Int,b:Int)=a/b

  def divide2(a:Int,b:Int)={
    if(b==0)
      None
    else
     Some(a/b)
  }

  def main(args: Array[String]): Unit = {


   // val res=divide(4,0)       //报错
  //  println(res)

    val res2=divide2(4,1)
    println(res2.getOrElse("除数"))

  }




}
