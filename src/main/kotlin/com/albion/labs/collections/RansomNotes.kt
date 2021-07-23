package com.albion.labs.collections

//  https://www.hackerrank.com/challenges/ctci-ransom-note/
class RansomNotes {
    companion object {
        fun checkMagazineWork(magazine: Array<String>, note: Array<String>): Boolean {
            val freq = generateFrequency(magazine)
            for (word in note) {
                if (freq[word] == null) {
                    return false
                } else {
                    val value = freq[word]!!
                    if (value == 0) {
                        return false
                    } else {
                        freq[word] = value - 1
                    }
                }
            }
            return true
        }

        private fun generateFrequency(magazine: Array<String>): MutableMap<String, Int> {
            val freq = mutableMapOf<String, Int>()
            for (word in magazine) {
                freq[word] = freq.getOrDefault(word, 0) + 1
            }
            return freq
        }
    }
}