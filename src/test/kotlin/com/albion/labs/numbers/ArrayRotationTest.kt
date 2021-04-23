package com.albion.labs.numbers

import org.junit.Assert
import org.junit.Test

class ArrayRotationTest {
    @Test
    fun testBasic() {
        val input = arrayOf(1,2,3,4,5)
        val expected = arrayOf(5,1,2,3,4)
        val actual = ArrayRotation.rotLeft(input, 4)
        val result = actual.contentDeepEquals(expected)
        Assert.assertTrue(result)
    }
}