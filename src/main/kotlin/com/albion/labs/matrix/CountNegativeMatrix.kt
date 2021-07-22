package com.albion.labs.matrix

// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
class CountNegativeMatrix {
    companion object {
        fun countNegatives(grid: Array<IntArray>): Int {
            var count = 0
            for (row in grid) {
                val temp = row.filter { it < 0 }
                    .map { 1 }
                    .fold(0) { sum, element -> sum + element }
                count += temp
            }
            return count
        }
    }
}