package com.albion.labs.dynamic

import java.util.*

class Fibonacci {
    fun v1(n: Int): Int {
        return when (n) {
            0 -> { 0 }
            1 -> { 1 }
            else -> { v1(n - 1) + v1(n - 2) }
        }
    }

    fun v2(n: Int): Int {
        val map = TreeMap<Int, Int>()
        map[0] = 0
        map[1] = 1

        if (n >= 2) {
            for (i in 2..n) {
                if (!map.containsKey(n)) {
                    val x = map[i - 1]!! + map[i - 2]!!
                    map[i] = x
                }
            }
        }
        return map[n]!!
    }

    fun v3(n: Int): Int {
        if (n < 2) {
            return n
        }
        val f = IntArray(n + 1)
        f[0] = 0
        f[1] = 1
        for (i in 2..n) {
            f[i] = f[i - 1] + f[i - 2]
        }
        return f[n]
    }
}