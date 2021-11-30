package com.albion.labs.numbers

// https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
class LeadersInArray {
    companion object {
        fun leaders(arr: IntArray): IntArray {
            val list = mutableListOf<Int>()
            for (i in arr.indices) {
                if (i != arr.lastIndex) {
                    val cur = arr[i]
                    val sub = (i + 1..arr.lastIndex)
                        .map { arr[it] }
                        .toIntArray()
                    if (cur >= sub.fold(0) { acc, e -> acc + e }) {
                        list.add(arr[i])
                    }
                } else {
                    list.add(arr[i])
                }
            }
            return list.toIntArray()
        }
    }
}