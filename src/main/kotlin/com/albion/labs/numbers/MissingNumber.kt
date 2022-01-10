package com.albion.labs.numbers

class MissingNumber {
    companion object {
        fun missingNumber(array: IntArray): Int {
            val n = array.size
            array.sort()
            var cur = 1
            for (i in 0 until n) {
                val now = array[i]
                if (cur != now) {
                    return cur
                }
                cur += 1
            }
            return 0
        }
    }
}