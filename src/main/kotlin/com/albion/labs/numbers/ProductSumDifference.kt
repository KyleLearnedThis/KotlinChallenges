package com.albion.labs.numbers

// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
class ProductSumDifference {
    companion object {
        fun subtractProductAndSum(n: Int): Int {
            val m = n.toString()
            var product = 1
            var sum = 0
            val base = '0'.toInt()
            for( c in m.toCharArray()) {
                val cur = c.toInt() - base
                product *= cur
                sum += cur
            }
            return product - sum
        }
    }
}