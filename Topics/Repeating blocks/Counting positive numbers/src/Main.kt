fun main() {
    val length = readln().toInt()
    var positive = 0
    repeat(length) {
        val num = readln().toInt()
        if (num > 0) {
            positive++
        }
    }
    print(positive)
}