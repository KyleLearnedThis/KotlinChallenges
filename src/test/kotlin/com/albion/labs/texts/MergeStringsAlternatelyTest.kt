package com.albion.labs.texts

import org.junit.Assert
import org.junit.Test

class MergeStringsAlternatelyTest {
    @Test
    fun mergeAlternatelyV1() {
        val expected = "apbqrs"
        val actual = MergeStringsAlternately.mergeAlternately("ab", "pqrs")
        Assert.assertEquals(expected, actual)
    }
    @Test
    fun mergeAlternatelyV2() {
        val expected = "apbqcr"
        val actual = MergeStringsAlternately.mergeAlternately("abc", "pqr")
        Assert.assertEquals(expected, actual)
    }
}