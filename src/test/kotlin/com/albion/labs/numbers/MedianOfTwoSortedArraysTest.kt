package com.albion.labs.numbers

import org.junit.Assert.assertEquals
import org.junit.Test

class MedianOfTwoSortedArraysTest {

    @Test
    fun testBasic01() {
        val nums1 = intArrayOf(1,3)
        val nums2 = intArrayOf(2)
        val expected = 2.0
        val actual = MedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2)
        assertEquals(actual, expected, 0.0)
    }

    @Test
    fun testBasic02() {
        val nums1 = intArrayOf(1,3)
        val nums2 = intArrayOf(2,4)
        val expected = 2.5
        val actual = MedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2)
        assertEquals(actual, expected, 0.0)
    }
}