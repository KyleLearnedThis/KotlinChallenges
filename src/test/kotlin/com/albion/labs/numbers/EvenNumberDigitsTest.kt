package com.albion.labs.numbers

import org.junit.Test

import org.junit.Assert.*

class EvenNumberDigitsTest {

    @Test
    fun findNumbers() {
        val input = intArrayOf(12,345,2,6,7896)
        val expected = 2
        val actual = EvenNumberDigits.findNumbers(input)
        assertEquals(actual, expected)
    }

    @Test
    fun findNumbersV2() {
        val input = intArrayOf(12,345,2,6,7896)
        val expected = 2
        val actual = EvenNumberDigits.findNumbersV2(input)
        assertEquals(actual, expected)
    }
}