object Demo05{

  def main(args: Array[String]): Unit = {

    //数组的转换
    var arr = Array(1,2,3,4,5)
    print("原有arr数组为: "+ arr.toBuffer)

    println()

    var arr2 = for ( e <- arr)yield e*3
    print("数组arr2为："+arr2.toBuffer)

    println()

    var arr3 = arr.map(_*2)
    print("数组arr3为： "+arr3.toBuffer)
    println()

    //filter相当于过滤器的性质
    var arr4 = arr.filter(_%2!=0).map(_*11)
    print("数组arr4为： "+arr4.toBuffer)
    println()

    //求该数组的最大值
    var max = arr.max
    println("最大值为："+max)

    //求和
    var sum = arr.sum
    println("和为："+sum)

    //排序
    var newArr = Array(3,1,5,66,2)
    println("排序结果为："+newArr.sorted.toBuffer)

  }
}
