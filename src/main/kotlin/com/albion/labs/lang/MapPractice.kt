package com.albion.labs.lang

class MapPractice {
    fun makeFrequencyMap(n: Array<Int>): MutableMap<Int, Int> {
        val map = mutableMapOf<Int, Int>()
        n.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }
        return map
    }

    fun printMap(map: MutableMap<Int, Int>) {
        for ((key, value) in map ){
            println("===== key: $key value: $value =====")
        }
    }

    fun sortMapByValue(map: MutableMap<Int, Int>): MutableMap<Int, Int> {
        return map.toList().sortedBy { (_, value) -> value }.toMap().toMutableMap()
    }

    fun sortMapByKey(map: MutableMap<Int, Int>): MutableMap<Int, Int> {
        return map.toList().sortedBy { (key, _) -> key }.toMap().toMutableMap()
    }
}