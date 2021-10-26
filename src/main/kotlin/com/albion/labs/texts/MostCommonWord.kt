package com.albion.labs.texts


class MostCommonWord {
    companion object {
        // Updated with better solution from ProAndroidDev
        fun mostCommonWord(paragraph: String, banned: Array<String>): String {
            // 1. Covert string to lower case and split by words.
            val words = paragraph.toLowerCase().split("\\W+|\\s+".toRegex())
            // 2. Create a set of banned words.
            val bannedSet = banned.toHashSet()
            // 3. Create a map of words to their occurrence, excluding the banned words
            val wordToCount = words.filterNot { it in bannedSet }.groupingBy { it }.eachCount()
            // 4. Return word with the highest number of occurrences from the map.
            return wordToCount.maxBy { it.value }!!.key
        }
    }
}