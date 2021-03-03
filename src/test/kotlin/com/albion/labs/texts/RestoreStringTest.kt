package com.albion.labs.texts

import org.junit.Assert
import org.junit.Test

class RestoreStringTest {

    @Test
    fun testBasic() {
        val s = "codeleet"
        val indices = intArrayOf(4,5,6,7,0,2,1,3)
        val expected = "leetcode"
        testWork(s, indices, expected)
    }

    private fun testWork(s: String, indices: IntArray, expected: String) {
        val actual = RestoreString.restoreString(s, indices)
        Assert.assertEquals(expected, actual)
    }
}