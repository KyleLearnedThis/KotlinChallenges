package com.albion.labs.texts

import org.junit.Test

import org.junit.Assert.*

class ComputeStringSumTest {

    @Test
    fun testBasic() {
        val input = "cab"
        val expected = 6
        val actual = ComputeStringSum.calculateSum(input)
        assertEquals(expected, actual)
    }

    @Test
    fun testLongString() {
        val input = "microspectrophotometries"
        val expected = 317
        val actual = ComputeStringSum.calculateSum(input)
        assertEquals(expected, actual)
    }
}