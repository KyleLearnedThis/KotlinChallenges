package com.albion.labs.numbers

import org.junit.Assert
import org.junit.Test

class Maximum69NumberTest {
    @Test
    fun testBasic() {
        val expected = 9969
        val actual = Maximum69Number.maximum69Number(9669)
        Assert.assertEquals(expected, actual)
    }
}