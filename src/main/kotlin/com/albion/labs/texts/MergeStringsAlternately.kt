package com.albion.labs.texts

import java.lang.StringBuilder
// https://leetcode.com/problems/merge-strings-alternately/
class MergeStringsAlternately {
    companion object {
        fun mergeAlternately(word1: String, word2: String): String {
            val m = word1.length
            val n = word2.length
            var i = 0
            val sb = StringBuilder()
            while (i < m || i < n) {
                if (i < m) {
                    sb.append(word1.toCharArray()[i])
                }
                if (i < n) {
                    sb.append(word2.toCharArray()[i])
                }
                i++
            }
            return sb.toString()
        }
    }
}