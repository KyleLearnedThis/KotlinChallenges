package com.albion.labs.matrix

import org.junit.Test

class SpiralMatrixTest {

    @Test
    fun spiralOrder() {
        val input = arrayOf(intArrayOf(1, 2, 3), intArrayOf(8, 9, 4), intArrayOf(7, 6, 5))
        val actual = SpiralMatrix.spiralOrder(input)
        for(item in actual) {
            print("[$item] ")
        }
    }
}