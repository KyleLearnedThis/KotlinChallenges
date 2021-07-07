package com.albion.labs.numbers

import org.junit.Test

import org.junit.Assert.*

class StudentHomeworksTest {

    @Test
    fun testBasic() {
        val startTime = intArrayOf(1,2,3)
        val endTime = intArrayOf(3,2,7)
        val queryTime = 4
        val actual = StudentHomeworks.busyStudent(startTime, endTime, queryTime)
        val expected = 1
        assertEquals(actual, expected)
    }
}