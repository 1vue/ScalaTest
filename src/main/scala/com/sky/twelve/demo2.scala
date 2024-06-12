package com.sky.twelve

object demo2 {
  def main(args: Array[String]): Unit = {

    def sum(a:Int)(b:Int)=a+b

    val add1:Int=>Int=sum(1)

    val res=add1(2)

    println(res)

def sum2(a:Int,b:Int)(f1:(Int,Int)=>Int)=f1(a,b)


    def test(x:Int,y:Int)=x*x*y
    val test2=test _

    val test3=(x:Int,y:Int)=>x*x*y
    val res2=sum2(3,6)(test3)
    println(res2)

  }
}
