package com.albion.labs.matrix

import com.albion.labs.matrix.CountNegativeMatrix
import org.junit.Assert
import org.junit.Test

class CountNegativeMatrixTest {

    @Test
    fun countNegatives() {
        val grid = arrayOf(
            intArrayOf(4,3,2,-1),
            intArrayOf(3,2,1,-1),
            intArrayOf(1,1,-1,-2),
            intArrayOf(-1,-1,-2,-3)
        )
        val expected = 8
        val actual = CountNegativeMatrix.countNegatives(grid)
        Assert.assertEquals(expected, actual)
    }
}