package com.sky.eleven

object demo2 {

  def main(args: Array[String]): Unit = {


    val arr=(3 to 10).toArray

    val Array(_,x,y,z,_*)=arr

println(x)

val list=(1 to 10).toList

    val List(a,b,_*)=list

    println(a,b)
  }



}
