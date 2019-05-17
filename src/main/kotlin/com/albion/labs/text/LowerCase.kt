package com.albion.labs.text

class LowerCase {
    fun toLowerCase(str: String): String {
        val charArray = str.toCharArray()
        for (i in charArray.indices) {
            charArray[i] = charArray[i].toLowerCase()
        }
        return String(charArray)
    }
}