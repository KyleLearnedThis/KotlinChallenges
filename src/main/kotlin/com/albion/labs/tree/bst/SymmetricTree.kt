package com.albion.labs.tree.bst

import com.albion.util.tree.bst.TreeNode

class SymmetricTree {
    fun isSymmetric(root: TreeNode<Int>?): Boolean {
        return root == null || isSymmetricWork(root.left, root.right)
    }

    private fun isSymmetricWork(left: TreeNode<Int>?, right: TreeNode<Int>?): Boolean {
        if (left == null || right == null) {
            return left === right
        }
        return if (left.data !== right.data) {
            false
        } else {
            isSymmetricWork(left.left, right.right) && isSymmetricWork(left.right, right.left)
        }
    }
}