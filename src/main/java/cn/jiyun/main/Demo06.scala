import scala.collection.mutable.Map

object Demo06{

  def main(args: Array[String]): Unit = {

    //映射
    val map = Map("Tom" -> "男","Lisa" -> "女","Kuli" -> "男","Zhumin" -> "女")
    println(map)

    //获取映射中的值
    println(map.get("Zhumin"))
    println("根据键获取值： "+map("Tom"))

    //返回映射值
    println("getOrElse返回的结果为："+map.getOrElse("Lisa",0))

    val newMap = Map("Tom" -> "男","Lisa" -> "女","Kuli" -> "男","Zhumin" -> "女")
    //可变的map
    newMap("Tom") = "人妖"
    println(newMap)

  }
}
