package com.albion.labs.collections

import org.junit.Test

import org.junit.Assert.*

class SetOperationsTest {

    @Test
    fun testIntersect() {
        val a = mutableSetOf(1,2,3,4,5,6)
        val b = mutableSetOf(5,6,7,8,9,10)
        val expected = mutableSetOf(5,6)
        val actual = SetOperations.intersect(a,b)
        assertEquals(expected, actual)
    }
}