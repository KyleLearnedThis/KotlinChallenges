package com.albion.labs.texts
// https://leetcode.com/problems/is-subsequence/

class SubSequenceCheck {
    companion object {
        fun isSubsequence(s: String, t: String): Boolean {
            if (t.length < s.length) {
                return false
            }
            var prev = 0
            val array = s.toCharArray()
            for (i in s.indices) {
                val ch: Char = array[i]
                prev = t.indexOf(ch, prev)
                if (prev == -1) return false
                prev++
            }

            return true
        }
    }
}