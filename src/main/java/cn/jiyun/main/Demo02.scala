object Demo02{

  def main(args: Array[String]): Unit = {

    //循环
    for ( i <- 1 to 5){
      print(i+"\t")
    }

    println()

    //循环遍历数组
    var arr = Array("a","b","c")
    for ( i <- arr ){
      print(i+"\t")
    }

    println()

    //嵌套双循环
    for (i <- 1 to 3; j <- 1 to 3 if i!=j){
      print("( "+i+" , "+j+" )"+"\t")
    }

    println()

    //通过yield之后，循环中的每个值都会乘以10，同时会返回一个集合类型的新对象
    var v = for ( i <- 1 to 5 )yield i*10
    print(v)

    println()

  }
}
