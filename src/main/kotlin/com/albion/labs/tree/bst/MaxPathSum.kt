package com.albion.labs.tree.bst

import com.albion.util.tree.bst.TreeNode
import kotlin.math.max

class MaxPathSum {
    companion object {
        private var maximum = Int.MIN_VALUE

        fun maxPathSum(root: TreeNode<Int>?): Int {
            calculateSum(root)
            return maximum
        }

        private fun calculateSum(root: TreeNode<Int>?): Int {
            if (root == null) {
                return 0
            }
            val left: TreeNode<Int>? = root.left
            val right: TreeNode<Int>? = root.right
            val leftValue = calculateSum(left)
            val rightValue = calculateSum(right)
            val current: Int = max(root.data, max(root.data + leftValue, root.data + rightValue))
            max(maximum, max(current, leftValue + root.data + rightValue)).also { maximum = it }
            return current
        }
    }
}