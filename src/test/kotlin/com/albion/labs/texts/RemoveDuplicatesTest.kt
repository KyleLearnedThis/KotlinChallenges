package com.albion.labs.texts

import org.junit.Test

import org.junit.Assert.*

class RemoveDuplicatesTest {

    @Test
    fun testBasic() {
        val input = "zvvo"
        val expected = "zvo"
        val actual = RemoveDuplicates.removeDuplicates(input)
        assertEquals(actual, expected)
    }
}