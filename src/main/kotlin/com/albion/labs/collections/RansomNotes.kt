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

        // For Hackerrank execution
        fun printConfirmation(magazine: Array<String>, note: Array<String>) {
            val result = checkMagazineWork(magazine, note)
            if (result) {
                println("Yes")
            } else {
                println("No")
            }
        }

        private fun generateFrequency(magazine: Array<String>): MutableMap<String, Int> {
            val freq = mutableMapOf<String, Int>()
            for (word in magazine) {
                if (freq.keys.contains(word)) {
                    var value = freq[word]!!
                    freq[word] = value + 1
                } else {
                    freq[word] = 1
                }
            }
            return freq
        }
    }
}