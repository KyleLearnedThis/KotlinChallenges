package com.albion.labs.collections

import com.albion.labs.collections.list.IntList
import org.junit.Test

import org.junit.Assert.*

class SumOfTwoListsTest {

    @Test
    fun testBasic() {
        val x = intArrayOf(2,4,3).toTypedArray()
        val y = intArrayOf(5,6,4).toTypedArray()
        val l1 = IntList(x)
        val l2 = IntList(y)
        val resultList = SumOfTwoLists.addTwoNumbers(l1.head, l2.head)
        resultList.print()
    }
}