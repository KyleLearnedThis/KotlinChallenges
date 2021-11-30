package com.albion.labs.texts

// https://www.hackerrank.com/challenges/two-strings/
class CommonSubstring {
    companion object {
        fun twoStrings(s1: String, s2: String): String {
            val c1 = s1.toCharArray()
            val c2 = s2.toCharArray()
            val c3 = c1.intersect(c2.asIterable().toSet()).sorted()
            val buffer = StringBuffer()
            for(ch in c3) {
                buffer.append(ch)
            }
            return buffer.toString()
        }
    }
}