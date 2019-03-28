package com.albion.labs.dynamic

import org.junit.Assert
import org.junit.Test


internal class FibonacciTest {

    @Test
    fun testV1() {
        val input = 10
        val expected = 55
        val fn = Fibonacci()
        val actual = fn.v1(input)
        Assert.assertEquals(actual, expected)
    }

    @Test
    fun testV2() {
        val input = 10
        val expected = 55
        val fn = Fibonacci()
        val actual = fn.v2(input)
        Assert.assertEquals(actual, expected)
    }

    @Test
    fun testV3() {
        val input = 10
        val expected = 55
        val fn = Fibonacci()
        val actual = fn.v3(input)
        Assert.assertEquals(actual, expected)
    }
}