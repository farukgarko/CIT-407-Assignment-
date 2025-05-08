// Base class Person with properties name and age
open class Person(private val name: String,private val age: Int) {
    fun printPersonDetails() {
        println("Name: $name")
        println("Age: $age")
    }
}
// Subclass Student that adds a property grade
class Student(name: String, age: Int,private val grade: Char) : Person(name, age) {
    fun printStudentDetails() {
        printPersonDetails()
        println("Grade: $grade")
    }
}
fun main() {
    val student = Student("Faruk Garko", 22, 'A')
    student.printStudentDetails()
}
