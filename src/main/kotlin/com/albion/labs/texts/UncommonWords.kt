package com.albion.labs.texts

// https://leetcode.com/problems/uncommon-words-from-two-sentences/
class UncommonWords {
    fun uncommonFromSentences(A: String, B: String): Array<String> {
        val aMap = makeFrequencyMap(A)
        val bMap = makeFrequencyMap(B)
        val map = selectUniqueWords(mergeTwoDictionary(aMap, bMap))

        val result = mutableListOf<String>()
        for((key, value)  in map) {
            if(value == 1) {
                result.add(key)
            }
        }
        return result.toTypedArray()
    }

    private fun makeFrequencyMap(input: String): MutableMap<String, Int> {
        val words = input.split(" ")
        val map = mutableMapOf<String, Int>()
        words.forEach{
            map[it] = map.getOrDefault(it, 0) + 1
        }
        return map
    }

    private fun selectUniqueWords(map: MutableMap<String, Int>): MutableMap<String, Int> {
        val result = mutableMapOf<String, Int>()
        for((key, value) in map){
            if(value == 1) {
                result[key] = value
            }
        }
        return result
    }

    private fun mergeTwoDictionary(m1: MutableMap<String, Int>, m2: MutableMap<String, Int>): MutableMap<String, Int> {
        val result = mutableMapOf<String, Int>()
        result.putAll(m1)
        for((key, _) in m2) {
            val v2 = m2[key]!!
            if(result.containsKey(key)) {
                val v1 = result[key]!!
                result[key] = v1 + v2
            } else {
                result[key] = v2
            }
        }
        return result
    }
}