fun main() {
    // Define a lambda expression that calculates the product of two integers
    val product = { a: Int, b: Int -> a * b }

    // Call the lambda expression and print the result
    val result = product(5, 7)
    println("The product is: $result") // Print the product
}