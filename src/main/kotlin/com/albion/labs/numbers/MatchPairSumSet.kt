package com.albion.labs.numbers

// https://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1
class MatchPairSumSet {
    companion object {
        fun allPairs(a: IntArray, b: IntArray, n: Int): Array<Pair<Int, Int>> {
            val hold = mutableListOf<Pair<Int, Int>>()
            for (l in a) {
                for (r in b) {
                    if (n == l + r) {
                        val pair = Pair(l, r)
                        hold.add(pair)
                    }
                }
            }
            return hold.toTypedArray()
        }
    }
}