object TestScala {

  def main(args: Array[String]): Unit = {

    // Question 1: Print "Hello, World!" on the screen
    println("Hello, world!")

    // Question 2: Calculate the sum of the numbers 1 to 5
    val sum = (1 to 5).sum
    println(sum)

    // Question 3: Define a function that returns the square of a num
    def square(number: Int): Int = number * number
    println(square(2))

    // Question 4: Create a list with the first three pair numbers
    val pairNumbers = List(2, 4, 6)
    println(pairNumbers)

    // Question 5: Use a conditional structure to determine whether a num is positive, negative, or zero
    val number = 7
    
    if (number > 0) {
      println("Positive")
    } else if (number < 0) {
      println("Negative")
    } else {
      println("Zero")
    }
  }
}
