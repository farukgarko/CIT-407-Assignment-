fun main(){
    print("Please enter your name: ") //asking user to enter his name
    val name = readlnOrNull() // Accepting name from user
    print("Please enter your age: ") //asking user to enter his age
    val age = readlnOrNull()?.toInt() //accepting age from user
    print("Hello $name, you are $age years old") //executing the program
}