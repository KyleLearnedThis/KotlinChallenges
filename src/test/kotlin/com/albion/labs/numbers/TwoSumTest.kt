package com.albion.labs.numbers

import org.junit.Assert
import org.junit.Test

class TwoSumTest {
    @Test
    fun testBasic() {
        val input = intArrayOf(2,7,11,15)
        val target = 9
        val expected = intArrayOf(0,1)
        val actual = TwoSum.twoSum(input, target)
        Assert.assertArrayEquals(expected, actual)
    }
}