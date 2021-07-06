package com.albion.labs.numbers

import org.junit.Test

import org.junit.Assert.*

class SumToZeroTest {

    @Test
    fun testOddV01() {
        val n = 5
        val output = SumToZero.sumZero(n)
        val actual = output.reduce { sum, element -> sum + element }
        assertEquals(0, actual)
    }

    @Test
    fun testEvenV01() {
        val n = 4
        val output = SumToZero.sumZero(n)
        val actual = output.reduce { sum, element -> sum + element }
        assertEquals(0, actual)
    }
}