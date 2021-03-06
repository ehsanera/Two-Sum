package com

import kotlin.system.measureNanoTime

fun main() {
    println("check performance")
    val time1 = measureNanoTime {
        Solutions().twoSumBasic(intArrayOf(1, 5, 8, 6, 9, 2, 3, 4, 7), 9)
    }
    val time2 = measureNanoTime {
        Solutions().twoSumBruteForce(intArrayOf(1, 5, 8, 6, 9, 4, 7), 9)
    }
    val time3 = measureNanoTime {
        Solutions().twoSumHashTable(intArrayOf(2, 1, 7, 5, 3, 8, 9, 4), 9)
    }
    val time4 = measureNanoTime {
        Solutions().onePassHashTable(intArrayOf(1, 5, 8, 6, 9, 2, 3, 4, 7), 9)
    }
    val time5 = measureNanoTime {
        Solutions().twoSumWhen(intArrayOf(1, 5, 8, 6, 9, 2, 3, 4, 7), 9)
    }

    println(time1)
    println(time2)
    println(time3)
    println(time4)
    println(time5)

    println("\nfunctions run")
    println(Solutions().twoSumBasic(intArrayOf(1, 5, 8, 6, 9, 2, 3, 4, 7), 9))
    println(Solutions().twoSumBruteForce(intArrayOf(1, 5, 8, 6, 9, 2, 3, 4, 7), 9))
    println(Solutions().twoSumHashTable(intArrayOf(1, 5, 8, 6, 9, 2, 3, 4, 7), 9))
    println(Solutions().onePassHashTable(intArrayOf(1, 5, 8, 6, 9, 2, 3, 4, 7), 9))
}