package com.albion.labs.classical

import java.util.*

class TopKElement {
    fun topKElement(numbers: IntArray, k: Int): Int {
        val freq = HashMap<Int, Int>(0)

        for (i in numbers.indices) {
            val key = numbers[i]
            if (freq.containsKey(key)) {
                val value = freq[key]!!.plus(1)
                freq[key] = value
            } else {
                freq[key] = 1
            }
        }

        val list = ArrayList<Map.Entry<Int, Int>>(freq.entries)
        list.sortWith(Comparator { o1, o2 -> o2.value - o1.value })
        return list[k - 1].key
    }
}