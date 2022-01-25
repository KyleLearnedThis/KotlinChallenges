package com.albion.labs.collections.list


class IntList(input: Array<Int>): BaseList<Int>(input) {
    fun print() {
        var cur = head
        while(cur != null) {
            println("[ ${cur.data} ]")
            cur = cur.next
        }
    }
}