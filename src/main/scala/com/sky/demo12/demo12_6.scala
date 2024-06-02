package com.sky.demo12

//实现模板方法
object demo12_6 {

   trait Template{

    def code()

    def getRunTime()={
      val start=System.currentTimeMillis()

      code()

      val end=System.currentTimeMillis()

      end-start
    }

  }

  class forDemo extends Template{

    override def code(): Unit = for (i<-1 to 1000) println("Hello")
  }

  def main(args: Array[String]): Unit = {
    var f=new forDemo

    println(f.getRunTime())
  }


}
