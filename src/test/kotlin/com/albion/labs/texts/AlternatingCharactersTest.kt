package com.albion.labs.texts

import org.junit.Test

import org.junit.Assert.*

class AlternatingCharactersTest {

    @Test
    fun testBasic() {
        val input = "AAAA"
        val expected = 3
        val actual = AlternatingCharacters.alternatingCharacters(input)
        assertEquals(actual, expected)
    }

    @Test
    fun testV02() {
        val input = "AAABBBAABB"
        val expected = 6
        val actual = AlternatingCharacters.alternatingCharacters(input)
        assertEquals(expected, actual)
    }

    @Test
    fun testV03() {
        val input = "ABABABAB"
        val expected = 0
        val actual = AlternatingCharacters.alternatingCharacters(input)
        assertEquals(expected, actual)
    }
}