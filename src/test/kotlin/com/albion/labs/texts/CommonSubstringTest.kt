package com.albion.labs.texts

import org.junit.Test

import org.junit.Assert.*

class CommonSubstringTest {

    @Test
    fun testBasic() {
        val s1 = "hello"
        val s2 = "world"
        val expected = "lo"
        val actual = CommonSubstring.twoStrings(s1, s2)
        assertEquals(actual, expected)
    }
}