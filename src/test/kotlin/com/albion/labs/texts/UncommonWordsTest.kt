package com.albion.labs.texts

import org.junit.Assert
import org.junit.Test

class UncommonWordsTest {

    @Test
    fun uncommonFromSentences() {
        val x = "this apple is sweet"
        val y = "this apple is sour"
        val uw = UncommonWords()
        val actual = uw.uncommonFromSentences(x,y)
        val expected = arrayOf("sweet","sour")
        Assert.assertTrue(actual.contentDeepEquals(expected))
    }

    @Test
    fun uncommonFromSentencesV2() {
        val x = "apple apple"
        val y = "banana"
        val uw = UncommonWords()
        val actual = uw.uncommonFromSentences(x,y)
        val expected = arrayOf("banana")
        Assert.assertTrue(actual.contentDeepEquals(expected))
    }

    @Test
    fun uncommonFromSentencesV3() {
        val x = "s z z z s"
        val y = "s z ejt"
        val uw = UncommonWords()
        val actual = uw.uncommonFromSentences(x,y)
        val expected = arrayOf("ejt")
        Assert.assertTrue(actual.contentDeepEquals(expected))
    }
}