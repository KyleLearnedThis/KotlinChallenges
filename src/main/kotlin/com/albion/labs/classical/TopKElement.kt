package com.albion.labs.classical

import java.util.*

class TopKElement {
    fun topKElement(numbers: IntArray, k: Int): Int {
        val freq = makeFrequencyMap(numbers)
        val list = ArrayList<Map.Entry<Int, Int>>(freq.entries)
        list.sortWith(Comparator { o1, o2 -> o2.value - o1.value })
        return list[k - 1].key
    }

    private fun makeFrequencyMap(n: IntArray): MutableMap<Int, Int> {
        val map = mutableMapOf<Int, Int>()
        n.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }
        return map
    }
}