package com.sky.demo12

object demo12_1 {


  trait MessageSender{

    def send(msg:String)

  }

  trait MessageReceiver{

    def receive()

  }

  class MessageWoker extends MessageSender with MessageReceiver {
    override def send(msg: String): Unit = println(msg)

    override def receive(): Unit = println("已收到")

  }

  def main(args: Array[String]): Unit = {

    var m=new MessageWoker
    m.send("发送信息")
    m.receive()

  }

}
