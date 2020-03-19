package com.albion.labs.numbers

import org.junit.Assert.assertEquals
import org.junit.Test

class ProductSumDifferenceTest {

    @Test
    fun subtractProductAndSum() {
        val input = 234
        val expected = 15
        val actual = ProductSumDifference.subtractProductAndSum(input)
        assertEquals(actual, expected)
    }
}