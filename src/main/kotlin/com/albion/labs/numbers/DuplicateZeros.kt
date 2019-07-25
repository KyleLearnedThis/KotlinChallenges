package com.albion.labs.numbers

// https://leetcode.com/problems/duplicate-zeros/
class DuplicateZeros {
    companion object {
        fun duplicateZeros(arr: IntArray) {
            var result = mutableListOf<Int>()
            for(i in arr.indices) {
                val value = arr[i]
                result.add(value)
                if(value == 0) {
                    result.add(0)
                }
            }
            val copy = result.subList(0, arr.size).toIntArray()
            for (i in arr.indices) {
                arr[i] = copy[i]
            }
        }
    }
}