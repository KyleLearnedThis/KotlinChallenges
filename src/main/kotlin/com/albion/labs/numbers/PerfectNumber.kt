package com.albion.labs.numbers

// https://leetcode.com/problems/perfect-number/
class PerfectNumber {
    companion object {
        fun checkPerfectNumber(num: Int): Boolean {
            if (num == 1) {
                return false
            }
            var divisors = mutableListOf<Int>()
            for (i in 1 until num) {
                if (num % i == 0) {
                    divisors.add(i)
                }
            }
            val sum = divisors.sum()
            return sum == num
        }
    }
}