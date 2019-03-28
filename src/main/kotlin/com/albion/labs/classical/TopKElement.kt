package com.albion.labs.classical

import java.util.*

class TopKElement {
    fun topKElement(nums: IntArray, k: Int): Int {
        val freq = HashMap<Int, Int>(0)

        for (i in nums.indices) {
            val key = nums[i]
            if (freq.containsKey(key)) {
                var value = freq[key]!!.plus(1)
                freq[key] = value
            } else {
                freq[key] = 1
            }
        }

        val list = ArrayList<Map.Entry<Int, Int>>(freq.entries)
        list.sortWith(Comparator { o1, o2 -> o2.value - o1.value })
        return list[k - 1]!!.key
    }
}