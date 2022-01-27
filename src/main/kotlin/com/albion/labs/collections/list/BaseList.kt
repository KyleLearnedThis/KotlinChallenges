package com.albion.labs.collections.list

abstract class BaseList<T> {
    var head: ListNode<T>? = null
    var tail: ListNode<T>? = null
    constructor()
    constructor(input: Array<T>) {
        input.forEach {
            append(it)
        }
    }
    fun append(value: T) {
        val node = ListNode(value)
        if(head == null) {
            head = node
            tail = head
        } else {
            tail?.next = node
            tail = node
            tail?.next = null
        }
    }
    val isEmpty: Boolean
        get() = (head == tail) && (head == null)

    fun size(): Int {
        return if(isEmpty) {
            0
        } else {
            var count = 0
            var cur = head
            while(cur != null) {
                count += 1
                cur = cur.next
            }
            count
        }
    }
}