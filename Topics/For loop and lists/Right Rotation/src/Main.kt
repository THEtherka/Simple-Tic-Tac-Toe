fun main() {
    val numberOfElements = readln().toInt()
    val list = mutableListOf<Int>()

    repeat(numberOfElements) {
        list += readln().toInt()
    }

    var rotates = readln().toInt()
    rotates %= numberOfElements
    repeat(rotates) {
        val last = list[numberOfElements - 1]
        for (i in numberOfElements - 1 downTo 1) {
            list[i] = list[i - 1]
        }
        list[0] = last
    }
    println(list.joinToString(" "))
}