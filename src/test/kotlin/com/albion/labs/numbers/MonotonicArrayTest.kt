package com.albion.labs.numbers

import org.junit.Assert
import org.junit.Test

class MonotonicArrayTest {

    @Test
    fun isMonotonic() {
        val mono = MonotonicArray()
        val input = intArrayOf(9,8,7,6,5)
        val expected = true
        val actual = mono.isMonotonic(input)
        Assert.assertEquals(expected, actual)
    }
}