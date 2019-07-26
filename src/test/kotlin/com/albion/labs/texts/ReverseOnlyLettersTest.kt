package com.albion.labs.texts

import org.junit.Assert
import org.junit.Test

class ReverseOnlyLettersTest {

    @Test
    fun reverseOnlyLetters() {
        val input = "ab-cd"
        val expected = "dc-ba"
        val actual = ReverseOnlyLetters.reverseOnlyLetters(input)
        Assert.assertEquals(actual, expected)
    }
}