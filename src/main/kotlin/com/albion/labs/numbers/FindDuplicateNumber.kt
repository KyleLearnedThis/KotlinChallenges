package com.albion.labs.numbers

// https://leetcode.com/problems/find-the-duplicate-number/
class FindDuplicateNumber {
    companion object {
        fun findDuplicate(nums: IntArray): Int {
            val inputs = nums.sorted()
            for (i in 1 until inputs.size) {
                if (inputs[i] == inputs[i - 1]) {
                    return inputs[i]
                }
            }
            return -1
        }
    }
}