package com


class Solutions {
    fun twoSumBasic(nums: IntArray, target: Int): List<Int> {
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    return listOf(i, j)
                }
            }
        }

        throw IllegalArgumentException("No solution")
    }

    fun twoSumWhen(nums: IntArray, target: Int): List<Int> {
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                when (nums[i] + nums[j]) {
                    target -> return listOf(i, j)
                }
            }
        }

        throw IllegalArgumentException("No solution")
    }

    fun twoSumBruteForce(nums: IntArray, target: Int): List<Int> {
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[j] == target - nums[i]) {
                    return listOf(i, j)
                }
            }
        }
        throw java.lang.IllegalArgumentException("No two sum solution")
    }

    fun twoSumHashTable(nums: IntArray, target: Int): List<Int> {
        val map: MutableMap<Int, Int> = HashMap()
        for (i in nums.indices) {
            map[nums[i]] = i
        }
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement) && map[complement] != i) {
                return listOf(i, map[complement]!!)
            }
        }
        throw java.lang.IllegalArgumentException("No two sum solution")
    }

    fun onePassHashTable(nums: IntArray, target: Int): List<Int> {
        val map: MutableMap<Int, Int> = HashMap()
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement)) {
                return listOf(map[complement]!!, i)
            }
            map[nums[i]] = i
        }
        throw java.lang.IllegalArgumentException("No two sum solution")
    }
}