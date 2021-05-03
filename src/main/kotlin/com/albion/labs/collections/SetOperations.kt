package com.albion.labs.collections

class SetOperations {
    companion object {
        fun intersect(a: MutableSet<Int>, b: MutableSet<Int>): MutableSet<Int> {
            val c = a.intersect(b)
            return c.toMutableSet()
        }
    }
}