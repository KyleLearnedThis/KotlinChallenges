package com.albion.labs.numbers
// https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/

class StudentHomeworks {
    companion object {
        fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
            val tupleList = startTime.zip(endTime)
            var count = 0
            for (tuple in tupleList) {
                val start = tuple.first
                val end = tuple.second
                if (queryTime in start..end) {
                    count += 1
                }
            }
            return count
        }
    }
}