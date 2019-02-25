import scala.collection.immutable.HashSet

object Demo09 extends App {

  val set1 = new HashSet[Int]()

  val set2 = set1+4
  println("set2: "+set2)

  val set3 = set2 ++ Set(4,4,4,5,6)
  println("set3: "+set3)
}
