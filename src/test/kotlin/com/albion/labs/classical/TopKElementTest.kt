package com.albion.labs.classical

import org.junit.Assert
import org.junit.Test

internal class TopKElementTest {

    @Test
    fun testTopKElementBasic() {
        val input = intArrayOf(1,2,2,3,3,3,4,4,4,4,5,5,5,5,5)
        val tke = TopKElement()
        val actual = tke.topKElement(input, 2)
        val expect = 4
        Assert.assertEquals(actual, expect)
    }
}