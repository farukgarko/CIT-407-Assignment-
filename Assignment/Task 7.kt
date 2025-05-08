class Car(val brand: String, val model: String, val year: Int) {
    // Function to display car details
    fun displayDetails() {
        println("Car Details:")
        println("Brand: $brand")
        println("Model: $model")
        println("Year: $year")
        println() // Empty line for better formatting
    }
}

fun main() {
    // Create two Car objects
    val car1 = Car("Toyota", "Camry", 2021)
    val car2 = Car("Honda", "Accord", 2020)

    // Display details of each car
    car1.displayDetails()
    car2.displayDetails()
}