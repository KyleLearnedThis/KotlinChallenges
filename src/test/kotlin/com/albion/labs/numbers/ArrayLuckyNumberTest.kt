package com.albion.labs.numbers

import org.junit.Assert.assertEquals
import org.junit.Test

class ArrayLuckyNumberTest {

    @Test
    fun testBasic() {
        val input = intArrayOf(1,2,2,3,3,3)
        val expected = 3
        val actual = ArrayLuckyNumber.findLucky(input)
        assertEquals(expected, actual)
    }
}