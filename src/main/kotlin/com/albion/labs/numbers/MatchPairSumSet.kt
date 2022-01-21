package com.albion.labs.numbers

// https://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1
class MatchPairSumSet {
    companion object {
        // Basic solution O(n) = n^2
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
            val result = hold.toTypedArray()
            result.sortBy { it.first }
            return result
        }

        // Hashing --> O(max(n, m))
        fun allPairsV2(a: IntArray, b: IntArray, n: Int): Array<Pair<Int, Int>> {
            val map = mutableMapOf<Int,Int>()
            val hold = mutableListOf<Pair<Int, Int>>()
            for(i in a) {
                map[i] = 0
            }
            for(j in b) {
                val rem = n - j
                if(map.containsKey(rem)) {
                    hold.add(Pair(rem, j))
                }
            }
            val result = hold.toTypedArray()
            result.sortBy { it.first }
            return result
        }
    }
}