package com.albion.labs.numbers

import org.junit.Assert.*
import org.junit.Test

class RunningSumArrayTest {
    @Test
    fun testArray01() {
        val input = arrayOf(1,2,3,4).toIntArray()
        val expected = arrayOf(1,3,6,10).toIntArray()
        val rsa = RunningSumArray()
        val actual = rsa.runningSum(input)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testArray02() {
        val input = arrayOf(1,1,1,1,1).toIntArray()
        val expected = arrayOf(1,2,3,4,5).toIntArray()
        val rsa = RunningSumArray()
        val actual = rsa.runningSum(input)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testArray03() {
        val input = arrayOf(3,1,2,10,1).toIntArray()
        val expected = arrayOf(3,4,6,16,17).toIntArray()
        val rsa = RunningSumArray()
        val actual = rsa.runningSum(input)
        assertArrayEquals(expected, actual)
    }
}