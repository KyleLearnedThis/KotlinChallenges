package com.albion.labs.numbers

/**
 * https://leetcode.com/problems/mean-of-array-after-removing-some-elements/
 * 20 <= arr.length <= 1000
 * arr.length is a multiple of 20.
 * 0 <= arr[i] <= 10^5
 */
class TrimArrayMeans {
    companion object {
        fun trimMean(arr: IntArray): Double {
            val n = arr.size
            val trimMax = (arr.size * 0.05).toInt()
            val trimMin = (arr.size * 0.05).toInt()
            arr.sort()
            val array = arr.copyOfRange(trimMin, n - trimMax)
            return array.fold(0) {total, sum -> total + sum}.toDouble() / array.size.toDouble()
        }
    }
}