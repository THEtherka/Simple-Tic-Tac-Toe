fun main() {
    val n = readln().toInt()
    var a = 0
    var b = 0
    var c = 0
    var d = 0
    repeat(n) {
        val x = readln().toInt()
        if (x == 2) {
            d++
        }
        if (x == 3) {
            c++
        }
        if (x == 4) {
            b++
        }
        if (x == 5) {
            a++
        }
    }
    print("$d $c $b $a")
}