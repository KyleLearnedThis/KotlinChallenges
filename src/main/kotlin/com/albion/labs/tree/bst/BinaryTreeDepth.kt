package com.albion.labs.tree.bst

import com.albion.util.tree.bst.TreeNode

class BinaryTreeDepth {
    fun minDepth(root: TreeNode<Int>?): Int {
        if (root == null) {
            return 0
        }
        val left = root.left
        val right = root.right
        val l = minDepth(left)
        val r = minDepth(right)

        return if(l == 0 || r == 0) {
            l + r + 1
        } else {
            Math.min(l,r) + 1
        }
    }

    fun maxDepth(root: TreeNode<Int>?): Int {
        if (root == null) {
            return 0
        }
        val left = root.left
        val right = root.right
        return Math.max(maxDepth(left), maxDepth(right)) + 1
    }
}