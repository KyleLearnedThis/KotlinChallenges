package com.albion.labs.numbers

// https://www.hackerrank.com/challenges/repeated-string/problem
class RepeatString {
    companion object {
        fun repeatedString(s: String, n: Long): Long {
            val size = s.length
            val occur = s.toCharArray().filter { it == 'a' }.size
            val cycle = n / size
            val remain = (n % size).toInt()
            val rest = s.subSequence(0, remain).toString().toCharArray().filter { it == 'a' }.size
            return occur * cycle + rest
        }
    }
}