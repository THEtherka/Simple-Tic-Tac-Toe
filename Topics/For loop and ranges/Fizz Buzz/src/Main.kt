fun main() {
    val x = readln().toInt()
    val y = readln().toInt()

    for (i in x..y){
        if(i % 3 == 0 && i % 5 == 0){
            println("FizzBuzz")
        } 
        else if(i % 3 == 0){
            println("Fizz")
        }
        else if(i % 5 == 0){
            println("Buzz")
        }
        else{
            println("$i")
        }
    }
}
