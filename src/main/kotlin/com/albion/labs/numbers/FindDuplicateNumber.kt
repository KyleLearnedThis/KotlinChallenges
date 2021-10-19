package com.albion.labs.numbers


class FindDuplicateNumber {
    companion object {
        // https://leetcode.com/problems/find-the-duplicate-number/
        fun findDuplicate(nums: IntArray): Int {
            val inputs = nums.sorted()
            for (i in 1 until inputs.size) {
                if (inputs[i] == inputs[i - 1]) {
                    return inputs[i]
                }
            }
            return -1
        }

        // https://leetcode.com/problems/set-mismatch/
        fun findErrorNums(nums: IntArray): IntArray {
            var dup = -1
            var sum = 0
            for (i in nums.indices) {
                val cur = kotlin.math.abs(nums[i])
                if (nums[cur - 1] < 0) {
                    dup = cur
                } else {
                    nums[cur - 1] *= -1
                }
                sum += i + 1 - cur
            }
            return intArrayOf(dup, dup + sum)
        }
    }
}