package com.albion.labs.bits

import org.junit.Assert
import org.junit.Test

class AlternateBitsTest {

    @Test
    fun hasAlternatingBitsTrue() {
        val ab = AlternateBits()
        val expected = true
        val actual = ab.hasAlternatingBits(341)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun hasAlternatingBitsFalse() {
        val ab = AlternateBits()
        val expected = true
        val actual = ab.hasAlternatingBits(8)
        Assert.assertNotEquals(expected, actual)
    }
}