package com.albion.labs.bits

class AlternateBits {
    fun hasAlternatingBits(n: Int): Boolean {
        val input = Integer.toBinaryString(n)
        var a: Int
        var b: Int
        for(i in 1 until input.length) {
            a = input[i - 1].toString().toInt()
            b = input[i].toString().toInt()
            if(a == b) {
                return false
            }
        }
        return true
    }
}