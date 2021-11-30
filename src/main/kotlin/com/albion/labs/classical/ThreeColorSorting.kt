package com.albion.labs.classical

class ThreeColorSorting {
    companion object {
        fun sortColors(nums: IntArray) {
            var low = 0
            var high = nums.size - 1
            var mid = 0
            while (mid <= high) {
                if (nums[mid] == 0) {
                    swap(nums, low++, mid++)
                } else if (nums[mid] == 2) {
                    swap(nums, high--, mid)
                } else {
                    mid++
                }
            }
        }

        private fun swap(array: IntArray, l: Int, r: Int) {
            val temp = array[l]
            array[l] = array[r]
            array[r] = temp
        }
    }
}