package com.albion.labs.numbers

import org.junit.Test

import org.junit.Assert.*

class MatchPairSumSetTest {

    @Test
    fun testBasic() {
        val a = intArrayOf(1, 2, 4, 5, 7)
        val b = intArrayOf(5, 6, 3, 4, 8)
        val n = 9
        val hold = arrayOf(
            intArrayOf(1,8),
            intArrayOf(4,5),
            intArrayOf(5,4)
        )
        val expected = makeExpectedPairArray(hold)
        val actual = MatchPairSumSet.allPairs(a,b,n)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testBasicV2() {
        val a = intArrayOf(1, 2, 4, 5, 7)
        val b = intArrayOf(5, 6, 3, 4, 8)
        val n = 9
        val hold = arrayOf(
            intArrayOf(1,8),
            intArrayOf(4,5),
            intArrayOf(5,4)
        )
        val expected = makeExpectedPairArray(hold)
        val actual = MatchPairSumSet.allPairsV2(a,b,n)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testNegativeNumberCase() {
        val a = intArrayOf(-1, -2, 4, -6, 5, 7)
        val b = intArrayOf(6, 3, 4, 0)
        val n = 8
        val hold = arrayOf(
            intArrayOf(4,4),
            intArrayOf(5,3)
        )
        val expected = makeExpectedPairArray(hold)
        val actual = MatchPairSumSet.allPairs(a,b,n)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testNegativeNumberCaseV2() {
        val a = intArrayOf(-1, -2, 4, -6, 5, 7)
        val b = intArrayOf(6, 3, 4, 0)
        val n = 8
        val hold = arrayOf(
            intArrayOf(4,4),
            intArrayOf(5,3)
        )
        val expected = makeExpectedPairArray(hold)
        val actual = MatchPairSumSet.allPairsV2(a,b,n)
        assertArrayEquals(expected, actual)
    }

    private fun makeExpectedPairArray(array: Array<IntArray>): Array<Pair<Int, Int>> {
        val hold = mutableListOf<Pair<Int, Int>>()
        for(row in array) {
            val l = row.first()
            val r = row.last()
            hold.add(Pair(l,r))
        }
        return hold.toTypedArray()
    }
}