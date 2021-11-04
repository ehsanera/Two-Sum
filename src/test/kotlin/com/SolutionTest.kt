package com

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun twoSum() {
        assertEquals(Solutions().twoSumBasic(intArrayOf(1, 5, 8, 6, 9, 2, 3, 4, 7), 9), listOf(0, 2))
        assertEquals(Solutions().twoSumBruteForce(intArrayOf(1, 5, 8, 6, 9, 2, 3, 4, 7), 9), listOf(0, 2))
        assertEquals(Solutions().twoSumHashTable(intArrayOf(1, 5, 8, 6, 9, 2, 3, 4, 7), 9), listOf(0, 2))
        assertEquals(Solutions().onePassHashTable(intArrayOf(1, 5, 8, 6, 9, 2, 3, 4, 7), 9), listOf(0, 2))
    }
}