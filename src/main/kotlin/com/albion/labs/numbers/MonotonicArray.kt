package com.albion.labs.numbers

class MonotonicArray {
    fun isMonotonic(A: IntArray): Boolean {
        val B = A.clone().sortedArray()
        val C = A.clone().sortedArrayDescending()

        return A.contentEquals(B) || A.contentEquals(C)
    }
}