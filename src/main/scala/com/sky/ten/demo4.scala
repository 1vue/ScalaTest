package com.sky.ten

object demo4 {

  case class Customer(name:String,age:Int){
  }

  case class Order(id:String){}

  def main(args: Array[String]): Unit = {

val c:Any=Customer("张三",12)

val o:Any=Order("2024")

    val x:Any=List(1,2,3)

    c match {
      case Customer(name, age)=>println(s"Customer类型对象，name字段为：${name},age字段为：${age}")
      case Order(id)=>println(s"Order类型对象，id字段为：${id}")

      case _=> println("未匹配")
    }


  }



}
