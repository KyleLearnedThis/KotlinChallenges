package com.albion.labs.numbers

import org.junit.Test

import org.junit.Assert.*

class KidsWithCandiesTest {

    @Test
    fun testCandies01() {
        val extraCandies = 3
        var input = arrayOf(2,3,5,1,3).toIntArray()
        var expected = arrayOf(true,true,true,false,true).toBooleanArray()
        val kwc = KidsWithCandies()
        val actual = kwc.kidsWithCandies(input, extraCandies)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testCandies02() {
        val extraCandies = 1
        var input = arrayOf(4,2,1,1,2).toIntArray()
        var expected = arrayOf(true,false,false,false,false).toBooleanArray()
        val kwc = KidsWithCandies()
        val actual = kwc.kidsWithCandies(input, extraCandies)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testCandies03() {
        val extraCandies = 10
        var input = arrayOf(12,1,12).toIntArray()
        var expected = arrayOf(true,false,true).toBooleanArray()
        val kwc = KidsWithCandies()
        val actual = kwc.kidsWithCandies(input, extraCandies)
        assertArrayEquals(expected, actual)
    }
}