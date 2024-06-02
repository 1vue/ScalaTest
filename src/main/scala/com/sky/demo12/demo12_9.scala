package com.sky.demo12

object demo12_9 {

  abstract class Programmer{

    var name:String=_
    var age:Int=_

    def eat(msg:String)
    def skill(msg:String)

  }

   class PythonProgrammer extends Programmer {



     override def eat(msg: String): Unit = println("PythonProgrammer eat")

     override def skill(msg: String): Unit = println("Python")
   }

  class JavaProgrammer extends Programmer{

    override def eat(msg: String): Unit = println("JavaProgrammer eat")

    override def skill(msg: String): Unit = println("Java")
  }

  trait bigData{
    def learningBigData()=println("learningBigData")
  }

  class PartPythonProgrammer extends PythonProgrammer with bigData{
    override def eat(msg: String): Unit = println("PartPythonProgrammer eat")

    override def skill(msg: String): Unit = {
      learningBigData()
      super.skill(msg)
    }
  }

  class PartJavaProgrammer extends JavaProgrammer with bigData{
    override def eat(msg: String): Unit = println("PartJavaProgrammer eat")

    override def skill(msg: String): Unit = {
      learningBigData()
      super.skill(msg)
    }
  }

  def main(args: Array[String]): Unit = {
    var p=new PartPythonProgrammer
    p.eat("1")
    p.skill("2")

    var j=new PartJavaProgrammer
    j.eat("3")
    j.skill("4")


  }

}
