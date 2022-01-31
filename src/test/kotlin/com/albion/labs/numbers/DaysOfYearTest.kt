package com.albion.labs.numbers

import org.junit.Assert
import org.junit.Test

class DaysOfYearTest {

    @Test
    fun testBasic() {
        val input = "2019-01-09"
        val expected = 9
        val actual = DaysOfYear.dayOfYear(input)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testMoreMonths() {
        val input = "2016-02-09"
        val expected = 40
        val actual = DaysOfYear.dayOfYear(input)
        Assert.assertEquals(expected, actual)
    }
    @Test
    fun testExtraDay() {
        val input = "2004-03-01"
        val expected = 61
        val actual = DaysOfYear.dayOfYear(input)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testExtraDayV2() {
        val input = "1900-05-02"
        val expected = 122
        val actual = DaysOfYear.dayOfYear(input)
        Assert.assertEquals(expected, actual)
    }
}