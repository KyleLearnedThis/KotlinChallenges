package com.albion.labs.texts

import java.util.*


// https://leetcode.com/problems/reverse-only-letters/
class ReverseOnlyLetters {
    companion object {
        fun reverseOnlyLetters(S: String): String {
            val array = S.toCharArray()
            val letters = Stack<Char>()
            for (c in array) {
                if (c.isLetter()) {
                    letters.push(c)
                }
            }
            val ans = StringBuilder()
            for (c in array) {
                if (c.isLetter()) {
                    ans.append(letters.pop())
                } else {
                    ans.append(c)
                }
            }
            return ans.toString()
        }
    }
}