package com.albion.labs.texts

import org.junit.Assert
import org.junit.Test

class SubSequenceCheckTest {

    @Test
    fun testBasic() {
        val s = "abc"
        val t = "ahbgdc"
        val expected = true
        val actual = SubSequenceCheck.isSubsequence(s, t)
        Assert.assertEquals(actual, expected)
    }

    @Test
    fun testV2() {
        val s = "aaaaaa"
        val t = "bbaaaa"
        val expected = false
        val actual = SubSequenceCheck.isSubsequence(s, t)
        Assert.assertEquals(actual, expected)
    }
}