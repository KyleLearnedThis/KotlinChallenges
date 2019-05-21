package com.albion.labs.texts

import org.junit.Assert
import org.junit.Test

class KeyboardRowTest {

    @Test
    fun findWords() {
        val inputs = arrayOf("Hello", "Alaska", "Dad", "Peace")
        val kr = KeyboardRow()
        val expected = arrayOf("Alaska", "Dad")
        val actual = kr.findWords(inputs)
        val isEqual = expected.contentDeepEquals(actual)
        Assert.assertTrue(isEqual)
    }
}