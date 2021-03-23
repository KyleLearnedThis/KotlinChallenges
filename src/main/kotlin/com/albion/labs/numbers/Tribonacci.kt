package com.albion.labs.numbers

class Tribonacci {
    companion object {
        fun tribonacci(n: Int): Int {
            val data = Array(n + 1) { 0 }
            return when (n) {
                0 -> 0
                1 -> 1
                2 -> 1
                else -> {
                    data[1] = 1
                    data[2] = 1
                    for (i in 3..n) {
                        data[i] = data[i - 1] + data[i - 2] + data[i - 3]
                    }
                    data.last()
                }
            }
        }
    }
}