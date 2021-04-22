package com.albion.labs.texts

import org.junit.Assert
import org.junit.Test

class ConvertToMilitaryTimeTest {

    @Test
    fun testBasic() {
        val input = "07:05:45PM"
        val expected = "19:05:45"
        val actual = ConvertToMilitaryTime.timeConversion(input)
        Assert.assertEquals(actual, expected)
    }

    @Test
    fun test02() {
        val input = "12:05:39AM"
        val expected = "00:05:39"
        val actual = ConvertToMilitaryTime.timeConversion(input)
        Assert.assertEquals(actual, expected)
    }
}