package com.albion.labs.tree.bst

import com.albion.util.tree.bst.TreeNode

// https://leetcode.com/problems/range-sum-of-bst/
class BSTRangeSum {
    companion object {
        fun rangeSumBST(root: TreeNode<Int>?, low: Int, high: Int): Int {
            return if (root != null) {
                val data = if (root.data in low..high) {
                    root.data
                } else {
                    0
                }
                val left = root.left
                val right = root.right
                val leftVal = rangeSumBST(left, low, high)
                val rightVal = rangeSumBST(right, low, high)
                data + leftVal + rightVal
            } else {
                0
            }
        }
    }
}