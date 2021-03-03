package com.albion.labs.texts

class RestoreString {
    companion object {
        fun restoreString(s: String, indices: IntArray): String {
            val input = s.toCharArray()
            val output = CharArray(s.length)
            val map = mutableMapOf<Int, Char>()

            for(i in input.indices) {
                val key = indices[i]
                val value = input[i]
                map[key] = value
            }

            for((key, value) in map) {
                output[key] = value
            }
            return String(output)
        }
    }
}