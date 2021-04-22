package com.albion.labs.numbers

import java.lang.StringBuilder

// This reverse a string but preserves all special character in its own original index position.
class ReverseNonSpecialChar {
    companion object {
        fun reverseNonSpecialCharacter(input: String): String {
            val buffer = input.toCharArray()
            val specialCharMap = mutableMapOf<Int, Char>()

            for (i in buffer.indices) {
                val ch = buffer[i]
                if (ch.isLetterOrDigit()) {
                    continue
                } else {
                    specialCharMap[i] = ch
                }
            }

            val normalString = input.filter { it.isLetterOrDigit() }
            val specialCharList = ArrayList<Map.Entry<Int, Char>>(specialCharMap.entries)
            specialCharList.sortWith(Comparator { o1, o2 -> o1.key - o2.key })

            val resultList = normalString.reversed().toMutableList()
            for (entry in specialCharList) {
                val index = entry.key
                val value = entry.value
                resultList.add(index, value)
            }

            val builder = StringBuilder()
            for (x in resultList) {
                builder.append(x)
            }
            return builder.toString()
        }
    }
}