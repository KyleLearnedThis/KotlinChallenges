package com.albion.labs.numbers

import org.junit.Assert
import org.junit.Test

class DuplicateZerosTest {

    @Test
    fun testBasic01() {
        val input = intArrayOf(1,0,2,3,0,4,5,0)
        val expected = intArrayOf(1,0,0,2,3,0,0,4)
        DuplicateZeros.duplicateZeros(input)
        val isEqual = expected.contentEquals(input)
        Assert.assertTrue(isEqual)
    }

    @Test
    fun testBasic02() {
        val input = intArrayOf(1,2,3)
        val expected = intArrayOf(1,2,3)
        DuplicateZeros.duplicateZeros(input)
        val isEqual = expected.contentEquals(input)
        Assert.assertTrue(isEqual)
    }
}