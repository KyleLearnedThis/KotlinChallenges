package com.albion.labs.numbers
// https://leetcode.com/problems/maximum-69-number/

class Maximum69Number {
    companion object {
        fun maximum69Number(num: Int): Int {
            val array = num.toString().toCharArray()
            for (i in array.indices) {
                val ch = array[i]
                if (ch == '6') {
                    array[i] = '9'
                    return String(array).toInt()
                }
            }
            return num
        }
    }
}