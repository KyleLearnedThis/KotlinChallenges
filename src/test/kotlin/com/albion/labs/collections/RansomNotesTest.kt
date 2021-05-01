package com.albion.labs.collections

import org.junit.Assert
import org.junit.Test

class RansomNotesTest {
    @Test
    fun testBasic() {
        val expected = true
        val magazine = "give me one grand today night".split(" ").toTypedArray()
        val notes = "give one grand today".split(" ").toTypedArray()
        val actual = RansomNotes.checkMagazineWork(magazine, notes)
        Assert.assertEquals(expected, actual)
    }
}