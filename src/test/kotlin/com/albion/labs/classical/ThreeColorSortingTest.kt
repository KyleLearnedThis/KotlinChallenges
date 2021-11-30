package com.albion.labs.classical

import org.junit.Assert
import org.junit.Test

class ThreeColorSortingTest {

    @Test
    fun testBasic() {
        val input = intArrayOf(2,0,2,1,1,0)
        val expected = intArrayOf(0,0,1,1,2,2)
        ThreeColorSorting.sortColors(input)
        Assert.assertArrayEquals(expected, input)
    }
}