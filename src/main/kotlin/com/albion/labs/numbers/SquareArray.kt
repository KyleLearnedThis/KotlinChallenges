package com.albion.labs.numbers

class SquareArray {
    companion object {
        fun sortedSquares(nums: IntArray): IntArray {
            return nums.map { it * it }
                .sorted()
                .toIntArray()
        }
    }
}