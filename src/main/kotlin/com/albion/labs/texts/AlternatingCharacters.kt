package com.albion.labs.texts

// https://www.hackerrank.com/challenges/alternating-characters/problem
class AlternatingCharacters {
    companion object {
        fun alternatingCharacters(s: String): Int {
            var count = 0
            val input = s.toCharArray()
            if (input.size == 1) {
                return count
            }
            var cur: Char
            for (i in input.indices) {
                cur = input[i]
                if ((i != input.size -1 )&&(cur == input[i + 1])) {
                    count += 1
                }
            }
            return count
        }
    }
}