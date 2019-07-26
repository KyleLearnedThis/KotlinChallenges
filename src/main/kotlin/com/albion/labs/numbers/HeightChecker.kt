package com.albion.labs.numbers

// https://leetcode.com/problems/height-checker/
class HeightChecker {
    companion object {
        fun heightChecker(heights: IntArray): Int {
            var result = 0
            val sorted = heights.copyOf().sorted()

            for(i in heights.indices) {
                if(heights[i] != sorted[i]) {
                    result++
                }
            }
            return result
        }
    }

}