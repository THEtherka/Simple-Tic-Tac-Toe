fun main() {
    val num = readln().toInt()
    println(maxLength(num))

}

fun maxLength(num: Int): Int {
    var length = 1
    var y = 1
    var max = 1
    for (i in 1..num) {
        val x = readln().toInt()
        if (i > 1) {
            if (x >= y) {
                length++
                if (length > max) {
                    max = length
                }
            } else {
                length = 1
            }
        }
        y = x
    }
    return max
}