package com.albion.labs.numbers

class EvenNumberDigits {
    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    companion object {
        fun findNumbers(nums: IntArray): Int {
            var result = 0
            for(num in nums) {
                val count = num.toString().toCharArray().size
                if(count % 2 == 0) {
                    result++
                }
            }
            return result
        }

        fun findNumbersV2(nums: IntArray): Int {
            return nums.map { it.toString().toCharArray() }
                .filter { it.count() % 2 == 0 }
                .map { 1 }
                .fold(0) { sum, value ->
                    sum + value
                }
        }
    }
}