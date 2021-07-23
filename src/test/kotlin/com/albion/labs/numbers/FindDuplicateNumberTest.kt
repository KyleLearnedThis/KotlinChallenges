package com.albion.labs.numbers

import org.junit.Test

import org.junit.Assert.*

class FindDuplicateNumberTest {
    @Test
    fun findDuplicate() {
        val input = intArrayOf(1,3,4,2,2)
        val expected = 2
        val actual = FindDuplicateNumber.findDuplicate(input)
        assertEquals(expected,actual)
    }
}