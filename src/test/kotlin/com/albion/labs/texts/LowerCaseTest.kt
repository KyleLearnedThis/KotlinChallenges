package com.albion.labs.texts

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

    @Test
    fun testToLowerCaseV2() {
        val input = "HoRaTiO"
        val expected = "horatio"
        val lowerCase = LowerCase()
        val actual = lowerCase.toLowerCaseV2(input)
        Assert.assertEquals(actual, expected)
    }
}