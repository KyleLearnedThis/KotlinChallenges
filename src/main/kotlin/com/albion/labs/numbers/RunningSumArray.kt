package com.albion.labs.numbers

// https://leetcode.com/problems/running-sum-of-1d-array/
class RunningSumArray {
    fun runningSum(nums: IntArray): IntArray {
        if(nums.size <= 1) {
            return nums
        }
        for(i in nums.indices) {
            if(i != nums.lastIndex) {
                val curVal = nums[i]
                nums[i+1] = nums[i+1] + curVal
            }
        }
        return nums
    }
}