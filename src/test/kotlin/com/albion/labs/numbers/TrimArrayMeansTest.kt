package com.albion.labs.numbers

import org.junit.Assert
import org.junit.Test

class TrimArrayMeansTest {

    @Test
    fun testBasic() {
        val input = arrayOf(1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3).toIntArray()
        val expected = 2.00000
        val actual = TrimArrayMeans.trimMean(input)
        Assert.assertEquals(expected, actual, 0.0001)
    }
}