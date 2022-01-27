package com.albion.labs.collections

import com.albion.labs.collections.list.IntList
import com.albion.labs.collections.list.ListNode
import kotlin.math.pow

// https://leetcode.com/problems/add-two-numbers/
class SumOfTwoLists {
    companion object {
        fun addTwoNumbers(l1: ListNode<Int>?, l2: ListNode<Int>?): ListNode<Int>? {
            var n1 = l1
            var n2 = l2
            var carry = 0
            val list = IntList()
            while (n1 != null || n2 != null || carry != 0) {
                if (n1 != null) {
                    carry += n1.data
                    n1 = n1.next
                }
                if (n2 != null) {
                    carry += n2.data
                    n2 = n2.next
                }
                list.append(carry % 10)
                carry /= 10
            }
            return list.head
        }

        // This only works on Int range, thus basic solution
        fun addTwoNumbersBasic(x: ListNode<Int>?, y: ListNode<Int>?): IntList {
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