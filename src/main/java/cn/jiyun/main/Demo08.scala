object Demo08{

  def main(args: Array[String]): Unit = {

    val list1 = List(1,2,3)
    println("list1: "+list1)

    val list2 = 0 :: list1
    println("list2: "+list2)

    val list3 = list1. :: (0)
    println("list3: "+list3)

    val list4 = list1. +: (0)
    println("list4: "+list4)

    val list5 = list1 :+ 4
    println("list5: "+list5)

    val list0 = List("A","B","C")
    val newList = list1.zip(list0)
    println("newList: "+newList)
    val list6 = list0 ++ list1
    println("list6: "+list6)
    for ( i <- list6){
      print(i+"\t")
    }
    println()
    val list7 =list1 ++: list0
    println("list7: "+list7)

    val list8 = list1 ::: list0
    println("list8: "+list8)


  }
}
