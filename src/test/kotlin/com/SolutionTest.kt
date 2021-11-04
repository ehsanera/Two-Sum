package com

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun twoSum() {
        t(intArrayOf(2, 7, 11, 15), 9, intArrayOf(0, 1))
        t(intArrayOf(3, 2, 4), 6, intArrayOf(1, 2))
    }

    private fun t(nums: IntArray, target: Int, expected: IntArray) {
        val actual = Solutions().twoSumBasic(nums, target)

        assertEquals(expected.size, actual.size)
        expected.forEachIndexed { index, i ->
            assertEquals(expected[index], i)
        }
    }
}