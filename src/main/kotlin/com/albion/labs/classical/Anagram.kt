package com.albion.labs.classical

class Anagram {
    companion object {
        fun isAnagram(first: String, second: String): Boolean =
            makeFrequencyDictionary(first) == makeFrequencyDictionary(second)
        private fun makeFrequencyDictionary(input: String): MutableMap<Char, Int> {
            val result = mutableMapOf<Char, Int>()
            input.toCharArray()
                .forEach { result[it] = result.getOrDefault(it, 0) + 1 }
            return result
        }
    }
}