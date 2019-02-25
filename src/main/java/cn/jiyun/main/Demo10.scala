import scala.collection.mutable.HashSet

object Demo10 extends App {

  val set = new HashSet[Int]()

  set.add(0)
  println("set: "+set)

  set ++= Set(1,2,3)
  println("set: "+set)

  set -= 3
  println("set: "+set)

  set.remove(0)
  println("set: "+set)

}
