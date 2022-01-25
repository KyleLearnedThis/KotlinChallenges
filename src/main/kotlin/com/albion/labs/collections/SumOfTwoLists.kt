package com.albion.labs.collections

import com.albion.labs.collections.list.IntList
import com.albion.labs.collections.list.ListNode
import kotlin.math.pow

// https://leetcode.com/problems/add-two-numbers/
class SumOfTwoLists {
    companion object {
        fun addTwoNumbers(x: ListNode<Int>?, y: ListNode<Int>?): IntList {
            val x1 = getIntValue(x)
            val y1 = getIntValue(y)
            val sum = x1 + y1
            val input = sum.toString()
                .toCharArray()
                .map { it.toInt() - 48 }
                .reversed()
            return IntList(input.toTypedArray())
        }

        private fun getIntValue(x: ListNode<Int>?): Int {
            var sum = 0
            var base = 0
            var cur = x
            while (cur != null) {
                val exp = (10.0).pow(base.toDouble()).toInt()
                sum += exp * cur.data
                cur = cur.next
                base += 1
            }
            return sum
        }
    }
}