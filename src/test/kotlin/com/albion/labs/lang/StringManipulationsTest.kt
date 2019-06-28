package com.albion.labs.lang

import org.junit.Assert
import org.junit.Test

class StringManipulationsTest {

    @Test
    fun testSubstringV1() {
        StringManipulations.substringV1()
    }

    @Test
    fun testSubstringV2() {
        StringManipulations.substringV2()
    }

    @Test
    fun testSplit() {
        val actual = StringManipulations.splitIntoArrays("1,10,100,1000", ",")
        val expected = arrayOf(1,10,100,1000).toMutableList()
        val result = (actual == expected)
        Assert.assertTrue(result)
    }
}