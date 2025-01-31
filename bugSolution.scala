```scala
import scala.collection.mutable.ListBuffer

object Main extends App {
  val list = new ListBuffer[Int]()
  list += 1
  list += 2
  list += 3

  // Correct way to convert ListBuffer to immutable List
  val immutableList = list.toList  // Create a copy!

  list += 4

  println(immutableList) // This will print List(1, 2, 3) as expected
}
```