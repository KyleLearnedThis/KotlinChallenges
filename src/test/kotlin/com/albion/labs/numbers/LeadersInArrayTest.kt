package com.albion.labs.numbers

import org.junit.Assert
import org.junit.Test

class LeadersInArrayTest {

    @Test
    fun testBasic() {
        val input = intArrayOf(16,17,4,3,5,2)
        val expected = intArrayOf(17,5,2)
        val actual = LeadersInArray.leaders(input)
        Assert.assertArrayEquals(expected, actual)
    }

    @Test
    fun testBasic02() {
        val input = intArrayOf(1,2,3,4,0)
        val expected = intArrayOf(4,0)
        val actual = LeadersInArray.leaders(input)
        Assert.assertArrayEquals(expected, actual)
    }
}