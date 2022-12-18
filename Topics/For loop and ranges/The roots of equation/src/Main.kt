import kotlin.math.pow

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()
    var x: Double
    for (i in 0..1000) {
        x = i.toDouble()
        if (a * x.pow(3) + b * x.pow(2) + c * x + d == 0.0) {
            println(i)
        }
    }
}