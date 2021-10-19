package com.albion.labs.numbers

// https://leetcode.com/problems/two-sum/
class TwoSum {
    companion object {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            val result = IntArray(2) { 0 }
            val map = mutableMapOf<Int, Int>()
            for (i in nums.indices) {
                val num = nums[i]
                if (map.containsKey(target - num)) {
                    result[1] = i
                    result[0] = map[target - num]!!
                    return result
                }
                map[num] = i
            }
            return result
        }
    }
}