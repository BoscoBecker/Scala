object HelloWorld {
  def main(args: Array[String]): Unit = {
  val fruits = List("apple", "banana", "avocado", "papaya")
  val countsToFruits = // count how many 'a' in each fruit
  fruits.groupBy(fruit => fruit.count(_ == 'a'))

for (count, fruits) <- countsToFruits do
  println(s"with 'a' × $count = $fruits")
  }
}
