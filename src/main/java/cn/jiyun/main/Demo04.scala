import scala.collection.mutable.ArrayBuffer

object Demo04{

  def main(args: Array[String]): Unit = {

    //定义一个数组,并对其进行遍历
    var arr = Array(1,2,3,4,5,6,7)
    for ( i <- 1 to arr.length){
      print(i+"\t")
    }
    println()

    for ( i <- arr){
      print(i+"\t")
    }
    println()
    println(arr.toBuffer)
    println("arr数组的长度为： "+arr.length)

    //可变数组
    var arr2 = ArrayBuffer[Int]()
    arr2 += 1
    println(arr2.toBuffer)
    //追加多个元素至数组之中
    arr2 += (2,3,4)
    println(arr2.toBuffer)
    //插入元素
    arr2.insert(0,66)
    println(arr2.toBuffer)
    //删除
    arr2.remove(0)
    println(arr2.toBuffer)
  }
}
