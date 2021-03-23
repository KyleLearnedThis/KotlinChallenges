package com.albion.labs.numbers

import org.junit.Assert
import org.junit.Test

class TribonacciTest {

    @Test
    fun testBasic() {
        val n = 25
        val expected = 1389537
        val actual = Tribonacci.tribonacci(n)
        Assert.assertEquals(actual, expected)
    }

    @Test
    fun testCase02() {
        val n = 1
        val expected = 1
        val actual = Tribonacci.tribonacci(n)
        Assert.assertEquals(actual, expected)
    }
}