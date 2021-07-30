package com.albion.labs.classical

import org.junit.Test

import org.junit.Assert.*

class AnagramTest {

    @Test
    fun isAnagram() {
        val expected = true
        val actual = Anagram.isAnagram("listen", "silent")
        assertEquals(expected, actual)
    }
}