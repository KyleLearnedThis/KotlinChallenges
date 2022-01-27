package com.albion.labs.collections

import com.albion.labs.collections.list.IntList
import com.albion.labs.collections.list.ListNode
import org.junit.Test

class SumOfTwoListsTest {

    @Test
    fun testBasic() {
        val x = intArrayOf(2,4,3).toTypedArray()
        val y = intArrayOf(5,6,4).toTypedArray()
        val l1 = IntList(x)
        val l2 = IntList(y)
        val resultList = SumOfTwoLists.addTwoNumbersBasic(l1.head, l2.head)
        resultList.print()
    }

    @Test
    fun testAddTwoNumbers() {
        val x = intArrayOf(2,4,3).toTypedArray()
        val y = intArrayOf(5,6,4).toTypedArray()
        val l1 = IntList(x)
        val l2 = IntList(y)
        val head = SumOfTwoLists.addTwoNumbers(l1.head, l2.head)
        printList(head)
    }

    private fun printList(head: ListNode<Int>?) {
        var cur = head
        while(cur != null) {
            println("[ ${cur.data} ]")
            cur = cur.next
        }
    }
}