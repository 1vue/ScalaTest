package com.sky.twelve

object demo8 {

  def show(name:String="李四")(implicit abc:(String,String))=abc._1+name+abc._2

//object valu{
//
//  implicit val abc_dafult=("<<"->">>")
//
//}

  def main(args: Array[String]): Unit = {



implicit val abc_dafult=("<<"->">>")
    println(show("张三"))


  }
}
