package com.albion.labs.numbers

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies
class KidsWithCandies {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {
        val result = mutableListOf<Boolean>()
        val maxIdx = candies.indexOf(candies.max()!!)
        val maxValue = candies[maxIdx]
        for(i in candies.indices) {
            if(i != maxIdx) {
                if (candies[i] + extraCandies >= maxValue) {
                    result.add(true)
                } else {
                    result.add(false)
                }
            } else {
                result.add(true)
            }
        }
        return result.toBooleanArray()
    }
}