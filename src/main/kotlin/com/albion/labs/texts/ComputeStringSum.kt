package com.albion.labs.texts

// https://www.reddit.com/r/dailyprogrammer/comments/onfehl/20210719_challenge_399_easy_letter_value_sum/
class ComputeStringSum {
    companion object {
        fun calculateSum(input: String): Int {
            val chars = input.toLowerCase()
                .toCharArray()
            val sum = chars.map {
                if (it.toString() == "") {
                    0
                } else {
                    it.toInt() - 96
                }
            }.reduce { acc, i -> acc + i }
            return sum
        }
    }
}