package com.albion.labs.numbers

import org.junit.Assert
import org.junit.Test

// https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1
class MissingNumberTest {
    @Test
    fun testBasic() {
        val input = intArrayOf(1,2,3,5)
        val expected = 4
        val actual = MissingNumber.missingNumber(input)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testLonger() {
        val input = intArrayOf(6,1,2,8,3,4,7,10,5)
        val expected = 9
        val actual = MissingNumber.missingNumber(input)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testOneLength() {
        val input = intArrayOf(2)
        val expected = 1
        val actual = MissingNumber.missingNumber(input)
        Assert.assertEquals(expected, actual)
    }
}