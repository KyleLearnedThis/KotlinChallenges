package com.albion.labs.numbers

import java.util.ArrayList

// https://leetcode.com/problems/find-lucky-integer-in-an-array/
class ArrayLuckyNumber {
    companion object {
        fun findLucky(arr: IntArray): Int {
            val map = mutableMapOf<Int, Int>()
            for (num in arr) {
                val freq = if (map.containsKey(num)) {
                    map[num]!! + 1
                } else {
                    1
                }
                map[num] = freq
            }

            val list = ArrayList<Map.Entry<Int, Int>>(map.entries)
            // sort on key descending order
            list.sortWith(Comparator { o1, o2 -> o2.key - o1.key })
            for (entry in list) {
                if (entry.key == entry.value) {
                    return entry.key
                }
            }
            return -1
        }
    }
}