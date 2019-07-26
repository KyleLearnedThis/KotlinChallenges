package com.albion.labs.numbers

import org.junit.Assert
import org.junit.Test

class HeightCheckerTest {

    @Test
    fun heightChecker() {
        val input = intArrayOf(1,1,4,2,1,3)
        val expected = 3
        val actual = HeightChecker.heightChecker(input)
        Assert.assertEquals(expected, actual)
    }
}