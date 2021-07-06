package com.albion.labs.numbers
// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

class SumToZero {
    companion object {
        fun sumZero(n: Int): IntArray {
            val result = arrayListOf<Int>()

            val count = if (n % 2 == 1) {
                result.add(0)
                (n - 1) / 2
            } else {
                n / 2
            }

            for (i in 0 until count) {
                val cur: Int = i + 1
                result.add(cur)
                result.add(-cur)
            }

            return result.toIntArray()
        }
    }
}