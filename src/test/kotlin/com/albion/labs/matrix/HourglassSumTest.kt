package com.albion.labs.matrix

import org.junit.Test

import org.junit.Assert.*

// https://www.hackerrank.com/challenges/2d-array/problem
class HourglassSumTest {

    @Test
    fun testBasic() {
        val input = arrayOf<Array<Int>>(
            arrayOf(1,1,1,0,0,0),
            arrayOf(0,1,0,0,0,0),
            arrayOf(1,1,1,0,0,0),
            arrayOf(0,0,2,4,4,0),
            arrayOf(0,0,0,2,0,0),
            arrayOf(0,0,1,2,4,0)
        )
        val expected = 19
        val actual = HourglassSum.hourglassSum(input)
        assertEquals(expected, actual)
    }
}