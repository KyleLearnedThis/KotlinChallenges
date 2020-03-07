package com.albion.labs.numbers

// https://leetcode.com/problems/median-of-two-sorted-arrays/
class MedianOfTwoSortedArrays {
    companion object {
        fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
            val m = nums1.size
            val n = nums2.size
            val A = Array(m+n) { 0 }

            var i = m - 1
            var j = n - 1
            var k = m + n - 1

            while (k >= 0) {
                if (j < 0 || i >= 0 && nums1[i] > nums2[j]) {
                    A[k--] = nums1[i--]
                } else {
                    A[k--] = nums2[j--]
                }
            }

            val o = A.size / 2
            return if(A.size % 2 == 0 ){
                (A[o-1] + A[o]).toDouble()/2.0
            } else {
                A[o].toDouble()
            }
        }
    }

}