package com.albion.labs.matrix

// https://www.hackerrank.com/challenges/2d-array/problem
class HourglassSum {
    companion object {
        fun hourglassSum(arr: Array<Array<Int>>): Int {
            val m = Array(4) { Array<Int>(4) { 0 } }
            for(h in 1..4) {
                for(v in 1..4) {
                    m[h-1][v-1] = getHourglassSum(arr,h,v)
                }
            }

            val max = findMaxSum(m)
            return max
        }

        fun getHourglassSum(arr: Array<Array<Int>>, row: Int, column: Int): Int {
            var sum = 0
            val r1 = arr[row-1][column-1]
            val r2 = arr[row-1][column]
            val r3 = arr[row-1][column+1]
            val r4 = arr[row][column]
            val r5 = arr[row+1][column-1]
            val r6 = arr[row+1][column]
            val r7 = arr[row+1][column+1]
            sum = r1+r2+r3+r4+r5+r6+r7
            return sum
        }

        fun findMaxSum(arr: Array<Array<Int>>): Int {
            var max = Int.MIN_VALUE
            for(x in arr.indices) {
                for(y in arr[x].indices) {
                    val cur = arr[x][y]
                    if(cur > max) {
                        max = cur
                    }
                }
            }
            return max
        }

        fun printMatrix(arr: Array<Array<Int>>) {
            for(x in arr.indices) {
                for(y in arr[x].indices) {
                    val value = arr[x][y]
                    print("[$x][$y] --> $value  ")
                }
                println()
            }
        }
    }
}