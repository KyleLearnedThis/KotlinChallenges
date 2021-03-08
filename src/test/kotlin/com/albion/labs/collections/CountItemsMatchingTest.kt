package com.albion.labs.collections

import org.junit.Assert
import org.junit.Test

class CountItemsMatchingTest {
    @Test
    fun testBasic() {
        val x1 = mutableListOf("phone","blue","pixel")
        val x2 = mutableListOf("computer","silver","lenovo")
        val x3 = mutableListOf("phone","gold","iphone")
        val input = mutableListOf<List<String>>(x1,x2,x3)
        val key = "color"
        val value = "silver"
        val expected = 1
        val actual = CountItemsMatching.countMatches(input, key, value)
        Assert.assertEquals(expected,actual)
    }
}