package com.albion.labs.text

import org.junit.Assert
import org.junit.Test

class LowerCaseTest {

    @Test
    fun testToLowerCase() {
        val input = "HoRaTiO"
        val expected = "horatio"
        val lowerCase = LowerCase()
        val actual = lowerCase.toLowerCase(input)
        Assert.assertEquals(actual, expected)
    }
}