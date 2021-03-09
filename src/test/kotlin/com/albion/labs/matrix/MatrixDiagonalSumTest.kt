package com.albion.labs.matrix

import org.junit.Assert
import org.junit.Test

class MatrixDiagonalSumTest {
    @Test
    fun testBasic() {
        var mat = arrayOf(
                intArrayOf(1,2,3),
                intArrayOf(4,5,6),
                intArrayOf(7,8,9)
        )
        val expected = 25
        val actual = MatrixDiagonalSum.diagonalSum(mat)
        Assert.assertEquals(actual, expected)
    }

    @Test
    fun testOnes() {
        var mat = arrayOf(
                intArrayOf(1,1,1,1),
                intArrayOf(1,1,1,1),
                intArrayOf(1,1,1,1),
                intArrayOf(1,1,1,1)
        )
        val expected = 8
        val actual = MatrixDiagonalSum.diagonalSum(mat)
        Assert.assertEquals(actual, expected)
    }

    @Test
    fun testSimpleMatrix() {
        var mat = arrayOf(intArrayOf(5))
        val expected = 5
        val actual = MatrixDiagonalSum.diagonalSum(mat)
        Assert.assertEquals(actual, expected)
    }
}