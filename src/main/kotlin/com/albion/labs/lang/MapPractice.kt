package com.albion.labs.lang

class MapPractice {
    fun makeFrequencyMap(n: Array<Int>): Map<Int, Int> {
        val map = mutableMapOf<Int, Int>()
        for(i in n) {
            if(map.containsKey(i)) {
                val value = map[i]!!.plus(1)
                map[i] = value
            } else {
                map[i] = 1
            }
        }
        return map
    }

    fun printMap(map: Map<Int, Int>) {
        for ((key, value) in map ){
            println("===== key: $key value: $value =====")
        }
    }

    fun sortMapByValue(map: Map<Int, Int>): Map<Int, Int> {
        val m =  map.toList().sortedBy { (key, value) -> value }.toMap()
        return m
    }

    fun sortMapByKey(map: Map<Int, Int>): Map<Int, Int> {
        val m =  map.toList().sortedBy { (key, value) -> key }.toMap()
        return m
    }
}