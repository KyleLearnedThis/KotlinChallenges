package com.albion.labs.texts

import java.util.*

// https://leetcode.com/problems/reverse-only-letters/
class ReverseOnlyLetters {
    companion object {
        fun reverseOnlyLetters(S: String): String {
            val letters = Stack<Char>()
            for (c in S.toCharArray())
                if (Character.isLetter(c)) {
                    letters.push(c)
                }
            val ans = StringBuilder()
            for (c in S.toCharArray()) {
                if (Character.isLetter(c)) {
                    ans.append(letters.pop())
                } else {
                    ans.append(c)
                }
            }
            return ans.toString()
        }
    }
}