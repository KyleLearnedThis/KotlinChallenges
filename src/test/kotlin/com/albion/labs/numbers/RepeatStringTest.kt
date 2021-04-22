package com.albion.labs.numbers

import org.junit.Assert
import org.junit.Test

class RepeatStringTest {
    @Test
    fun testBasic() {
        val input = "aba"
        val n: Long = 10
        val expected = 7
        val actual = RepeatString.repeatedString(input, n)
        Assert.assertEquals(expected, actual)
    }
}