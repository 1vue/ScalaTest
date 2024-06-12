package com.sky.seven

object demo6 {

  def main(args: Array[String]): Unit = {

    val turple=("张三",20)

    println(turple._1)

    val turple2= "张三"->22

   var it =turple2.productIterator
    for(i<-it) println(i)

  }



}
