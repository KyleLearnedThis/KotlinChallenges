package com.albion.labs.texts

import org.junit.Assert
import org.junit.Test

class MostCommonWordTest {

    @Test
    fun mostCommonWord() {
        val input = "Bob hit a ball, the hit BALL flew far after it was hit."
        val bannedWords = arrayOf("hit")
        val expected = "ball"
        val actual = MostCommonWord.mostCommonWord(input, bannedWords)
        Assert.assertEquals(expected, actual)
    }
}