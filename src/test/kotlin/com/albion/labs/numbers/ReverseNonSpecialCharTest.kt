package com.albion.labs.numbers

import org.junit.Assert
import org.junit.Test

class ReverseNonSpecialCharTest {

    @Test
    fun reverseNonSpecialCharacter() {
        val input = "a*bcd-ef"
        val expected = "f*edc-ba"
        val actual = ReverseNonSpecialChar.reverseNonSpecialCharacter(input)
        Assert.assertEquals(expected, actual)
    }
}