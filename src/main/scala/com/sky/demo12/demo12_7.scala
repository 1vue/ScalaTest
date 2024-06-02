package com.sky.demo12

//实现职责链模式
object demo12_7 {


  trait Handle{
    def handle(msg:String)={
      println("处理数据")
      println(msg)
    }

  }

  trait DataValidHandle extends Handle{
    override def handle(msg: String): Unit = {
      println("验证数据")
      super.handle(msg)
    }
  }

  trait SignatureValidHandle extends Handle {
    override def handle(msg: String): Unit = {
      println("检查签名")
      super.handle(msg)
    }
  }

  class payment extends DataValidHandle with SignatureValidHandle {
    override def handle(msg: String): Unit = {
      println("用户发起支付请求")
      super.handle(msg)
    }

  }

  def main(args: Array[String]): Unit = {
    var p=new payment
    p.handle("转账1000元")
  }

}
