package com.albion.labs.numbers

import org.junit.Assert
import org.junit.Test

class PerfectNumberTest {

    @Test
    fun testCaseV1() {
        testCaseWorker(28, true)
    }

    @Test
    fun testCaseV2() {
        testCaseWorker(6, true)
    }

    @Test
    fun testCaseV3() {
        testCaseWorker(496, true)
    }

    @Test
    fun testCaseV4() {
        testCaseWorker(2, false)
    }

    private fun testCaseWorker(num: Int, expected: Boolean) {
        val actual = PerfectNumber.checkPerfectNumber(num)
        Assert.assertEquals(expected, actual)
    }
}