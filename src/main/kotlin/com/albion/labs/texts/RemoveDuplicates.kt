package com.albion.labs.texts

// https://practice.geeksforgeeks.org/problems/remove-duplicates3034/1
class RemoveDuplicates {
    companion object {
        fun removeDuplicates(S: String): String {
            val chars = S.toCharArray()
            val builder = StringBuilder()
            val set = mutableSetOf<Char>()
            for (ch in chars) {
                if (!set.contains(ch)) {
                    set.add(ch)
                    builder.append(ch)
                }
            }
            return builder.toString()
        }
    }
}