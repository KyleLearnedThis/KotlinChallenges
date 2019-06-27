package com.albion.labs.tree.bst

import com.albion.util.tree.bst.TreeNode

class HeightBalancedTree {
    fun sortedArrayToBST(nums: IntArray): TreeNode<Int>? {
        return if (nums.isEmpty()) {
            null
        } else sortedArrayToBST(nums, 0, nums.size - 1)
    }

    private fun sortedArrayToBST(nums: IntArray, low: Int, high: Int): TreeNode<Int>? {
        if (low > high) {
            return null
        }

        val mid = (high + low) / 2
        val cur = TreeNode(nums[mid])
        cur.left = sortedArrayToBST(nums, low, mid - 1)
        cur.right = sortedArrayToBST(nums, mid + 1, high)
        return cur
    }
}