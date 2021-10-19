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

    @Test
    fun testFindDupilcateInSortedArray() {
        val nums = intArrayOf(1,2,2,4)
        val expected = intArrayOf(2,3)
        val actual = FindDuplicateNumber.findErrorNums(nums)
        assertArrayEquals(expected, actual)
    }
}