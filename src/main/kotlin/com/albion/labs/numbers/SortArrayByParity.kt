package com.albion.labs.numbers

class SortArrayByParity {
    fun sortArrayByParityII(A: IntArray): IntArray {
        var e = 0
        var o = 1
        val n = IntArray(A.size)
        for (i in 0 until A.size) {
            if (A[i] % 2 === 0) {
                n[e] = A[i]
                e += 2
            } else {
                n[o] = A[i]
                o += 2
            }
        }
        return n
    }
}