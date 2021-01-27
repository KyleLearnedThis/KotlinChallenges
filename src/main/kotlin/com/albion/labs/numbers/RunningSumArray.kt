package com.albion.labs.numbers

// https://leetcode.com/problems/running-sum-of-1d-array/
class RunningSumArray {
    fun runningSum(nums: IntArray): IntArray {
        var result = nums
        if(result.size <= 1) {
            return result
        }
        for(i in result.indices) {
            if(i != result.lastIndex) {
                val curVal = result[i]
                result[i+1] = result[i+1] + curVal
            }
        }
        return result
    }
}