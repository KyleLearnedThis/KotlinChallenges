package com.albion.labs.texts

import org.junit.Assert
import org.junit.Test

class IPDefangerTest {

    @Test
    fun testBasic() {
        val input = "1.1.1.1"
        val expected = "1[.]1[.]1[.]1"
        val actual = IPDefanger.defangIPaddr(input)
        Assert.assertEquals(actual, expected)
    }
}