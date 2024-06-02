package com.sky.demo8

object demo8  {

  class Person{

    private var name:String=_
  }


  object Person{

    def PrintPerson(p:Person)=println(p.name)
  }

  def main(args: Array[String]): Unit = {
    var p=new Person()
    Person.PrintPerson(p)
  }


}
