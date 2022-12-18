package tictactoe

import kotlin.collections.MutableList

fun main() {
    var ticTac = mutableListOf(
        mutableListOf('_', '_', '_'),
        mutableListOf('_', '_', '_'),
        mutableListOf('_', '_', '_')
    )
    var p = 'X'
    var d = 1
    grid(ticTac)
    for (i in 1..9) {
        ticTac = move(ticTac, p)
        grid(ticTac)
        p = if (p == 'X') {
            'O'
        } else 'X'
        if (check(ticTac)) {
            d = 0
            break
        }
    }
    if (d == 1) {
        println("Draw")
    }
}

fun grid(l: MutableList<MutableList<Char>>) {
    println("---------")
    println("| ${l[0][0]} ${l[0][1]} ${l[0][2]} |")
    println("| ${l[1][0]} ${l[1][1]} ${l[1][2]} |")
    println("| ${l[2][0]} ${l[2][1]} ${l[2][2]} |")
    println("---------")
}

fun check(chars: MutableList<MutableList<Char>>): Boolean {
    //possibility
    //wins
    //X
    if (win('X', chars)) {
        println("X wins")
        return true
    } else if (win('O', chars)) {
        println("O wins")
        return true
    } else {
        return false
    }
}

fun win(z: Char, chars: MutableList<MutableList<Char>>): Boolean {
    for (i in 0..2) {
        var countr = 0
        var countc = 0
        for (j in 0..2) {
            if (chars[i][j] == z) {
                countr++
            }
            if (chars[j][i] == z) {
                countc++
            }
        }
        if (countr == 3 || countc == 3) {
            return true
        }
    }
    if (((chars[0][0] == z) && (chars[1][1] == z) && (chars[2][2] == z)) || ((chars[0][2] == z) && (chars[1][1] == z) && (chars[2][0] == z))) {
        return true
    }
    return false
}

fun move(chars: MutableList<MutableList<Char>>, player: Char): MutableList<MutableList<Char>> {

    var correct: Boolean
    do {
        correct = false
        print("> ")
        val coordinates = readln().split(" ")
        val x = coordinates[0].toIntOrNull()
        val y = coordinates[1].toIntOrNull()
        if (x != null && y != null) {
            if ((x in 1..3) && (y in 1..3)) {
                if (chars[x - 1][y - 1] == 'X' || chars[x - 1][y - 1] == 'O') {
                    println("This cell is occupied! Choose another one!")
                } else {
                    chars[x - 1][y - 1] = player
                    correct = true
                }
            } else {
                println("Coordinates should be from 1 to 3!")
            }
        } else {
            println("You should enter numbers!")
        }
    } while (!correct)
    return chars
}