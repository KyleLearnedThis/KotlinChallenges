package com.albion.labs.texts

import org.junit.Assert
import org.junit.Test

class MultiplyNumberStringsTest {
    @Test
    fun testBasic() {
        val m = "12345"
        val n = "98765"
        val expected = "1219253925"
        val actual = MultiplyNumberStrings.multiply(m, n)
        Assert.assertEquals(expected, actual)
    }
}