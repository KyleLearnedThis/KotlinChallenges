// https://leetcode.com/problems/count-items-matching-a-rule/
package com.albion.labs.collections

class CountItemsMatching {
    companion object {
        fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
            var count = 0
            val index = when (ruleKey) {
                "type" -> 0
                "color" -> 1
                "name" -> 2
                else -> error("Invalid Index")
            }
            for (item in items) {
                if (item[index] == ruleValue) {
                    count++
                }
            }
            return count
        }
    }
}