package com

fun main() {
    println(Solutions().twoSumBasic(intArrayOf(1, 5, 8, 6, 9, 2, 3, 4, 7), 9))
    println(Solutions().twoSumBruteForce(intArrayOf(1, 5, 8, 6, 9, 2, 3, 4, 7), 9))
    println(Solutions().twoSumHashTable(intArrayOf(1, 5, 8, 6, 9, 2, 3, 4, 7), 9))
    println(Solutions().onePassHashTable(intArrayOf(1, 5, 8, 6, 9, 2, 3, 4, 7), 9))
}