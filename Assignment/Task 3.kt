fun main(){
    print("Please enter any number: ")
    val num = readln().toInt()
    if (num % 2 == 0){
        print("$num is an even number")
    }else{
        print("$num is an odd number")
    }
}