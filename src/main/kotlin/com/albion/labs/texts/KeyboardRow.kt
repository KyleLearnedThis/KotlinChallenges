package com.albion.labs.texts

// https://leetcode.com/problems/keyboard-row/
class KeyboardRow {
    fun findWords(words: Array<String>): Array<String> {
        val store = ArrayList<String>()
        val top = "QWERTYUIOP"
        val middle = "ASDFGHJKL"
        val bottom = "ZXCVBNM"

        for(word in words) {
            when {
                isSameRow(word, top) -> store.add(word)
                isSameRow(word, middle) -> store.add(word)
                isSameRow(word, bottom) -> store.add(word)
            }
        }
        return store.toTypedArray()
    }

    private fun isSameRow(input: String, row: String): Boolean {
        for(i in input.indices) {
            val x = input[i]
            if(row.toCharArray().contains(x.toLowerCase()) || row.toCharArray().contains(x.toUpperCase()) ) {
                continue
            } else {
                return false
            }
        }
        return true
    }
}