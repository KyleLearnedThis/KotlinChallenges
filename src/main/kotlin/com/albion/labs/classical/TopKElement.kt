package com.albion.labs.classical

import java.util.*

class TopKElement {
    fun topKElement(numbers: IntArray, k: Int): Int {
        val freq = makeFrequencyMap(numbers)
        val list = ArrayList<Map.Entry<Int, Int>>(freq.entries)
        list.sortWith(Comparator { o1, o2 -> o2.value - o1.value })
        return list[k - 1].key
    }

    private fun makeFrequencyMap(n: IntArray): MutableMap<Int, Int> =
       n.toList().groupingBy { it }.eachCount().toMutableMap()
}