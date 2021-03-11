package com.albion.labs.texts

import java.util.ArrayList

class MostCommonWord {
    companion object {
        fun mostCommonWord(paragraph: String, banned: Array<String>): String {
            val map = emptyMap<String, Int>().toMutableMap()
            val phrases = paragraph.split("\\W+".toRegex()).filter { it != "" }

            for (word in phrases) {
                val lowerCasedWord = word.toLowerCase()
                if (banned.contains(lowerCasedWord)) {
                    continue
                }
                if (map.containsKey(lowerCasedWord)) {
                    val value = map[lowerCasedWord]!!
                    map[lowerCasedWord] = value + 1
                } else {
                    map[lowerCasedWord] = 1
                }
            }
            val list = ArrayList<Map.Entry<String, Int>>(map.entries)
            list.sortWith(Comparator { o1, o2 -> o2.value - o1.value })

            return if (list.size >= 1) {
                list[0].key
            } else {
                ""
            }
        }
    }
}