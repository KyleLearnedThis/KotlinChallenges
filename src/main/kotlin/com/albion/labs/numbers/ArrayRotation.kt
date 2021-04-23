package com.albion.labs.numbers

// https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
class ArrayRotation {
    companion object {
        fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
            val offset = d % a.size
            return if (offset == 0) {
                a
            } else {
                val l = a.copyOfRange(0, offset)
                val r = a.copyOfRange(offset, a.size)
                val w = arrayOf(*r, *l)
                w
            }
        }
    }
}