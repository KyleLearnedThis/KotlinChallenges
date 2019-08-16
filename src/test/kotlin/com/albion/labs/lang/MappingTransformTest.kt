package com.albion.labs.lang

import com.albion.labs.lang.data.Person
import org.junit.Test

class MappingTransformTest {

    @Test
    fun testJoinArraysIntoMap01() {
        val names = arrayOf("Aaron", "Ben", "Chris")
        val values = arrayOf(1, 10, 100)
        val map = MappingTransform.joinArraysIntoMap(names, values)
        MappingTransform.printMap(map)
    }

    @Test
    fun testJoinArraysIntoMap02() {
        val people = arrayOf(Person("Aaron", 1), Person("Ben", 10), Person("Chris", 100))
        val map = MappingTransform.convertPersonArrayIntoMap(people)
        MappingTransform.printMap(map)
    }
}