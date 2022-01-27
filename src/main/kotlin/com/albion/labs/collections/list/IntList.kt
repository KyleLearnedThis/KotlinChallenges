package com.albion.labs.collections.list


class IntList: BaseList<Int> {
    constructor()
    constructor(input: Array<Int>) : super(input)

    fun print() {
        var cur = head
        while(cur != null) {
            println("[ ${cur.data} ]")
            cur = cur.next
        }
    }
}