package com.albion.labs.collections.list

import org.junit.Test

class IntListTest {

    @Test
    fun testBasic() {
        val input = intArrayOf(1,2,3,4,5,6,7,8).toTypedArray()
        val list = IntList(input)
        list.print()
    }

    @Test
    fun testBasicV2() {
        val input = intArrayOf(1,2,3,4,5,6,7,8)
        val list = IntList(emptyArray())
        input.forEach { list.append(it) }
        list.print()
    }
}