package com.albion.labs.classical

import org.junit.Assert
import org.junit.Test

class RPNCalculatorTest {

    @Test
    fun testEvaluate() {
        val input = arrayOf("2", "1", "+", "3", "*")
        val expected = 9
        val actual = RPNCalculator.evaluate(input)
        Assert.assertEquals(actual, expected)
    }
}