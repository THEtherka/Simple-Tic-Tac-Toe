fun main() {
    val (val1, operator, val2) = readln().split(" ")
    val num1 = val1.toLong()
    val num2 = val2.toLong()

    when (operator) {
        "+" -> println(num1 + num2)
        "-" -> println(num1 - num2)
        "*" -> println(num1 * num2)
        "/" ->
            if (num2.toInt() == 0) {
                println("Division by 0!")
            } else {
                println(num1 / num2)
            }

        else -> println("Unknown operator")
    }
}