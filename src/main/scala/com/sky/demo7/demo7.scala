package com.sky.demo7

object demo7 {


  def main(args: Array[String]): Unit = {
    class General{

      def toWar(weapon:String="***")={
        print(s"拿着${General.weapon}上阵")
      }
    }

    object General{
     private var weapon:String="篮球"
    }

    var g=new General()
    g.toWar()
  }

}
