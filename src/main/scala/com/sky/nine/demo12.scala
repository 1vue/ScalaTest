package com.sky.nine
//学生成绩案例
object demo12 {
  def main(args: Array[String]): Unit = {

    val list =List(("张三",37,90,100),("李四",90,73,81),("王五",60,90,76),("赵六",59,21,72),("田七",100,100,100))

var list1=list.filter(x=>x._2>=60)

    val list2=list.map(x=>x._1->(x._2+x._3+x._4))
//    list2.foreach(println(_))

//    指定排序规则
    val list3=list2.sortWith((x,y)=>x._2>y._2)
    list3.foreach(println(_))

//    指定用什么排序
    val list4=list2.sortBy(_._2)
    list4.foreach(println(_))

  }
}
