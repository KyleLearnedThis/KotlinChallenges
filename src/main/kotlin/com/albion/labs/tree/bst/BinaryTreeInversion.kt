package com.albion.labs.tree.bst

import com.albion.tree.bst.TreeNode

class BinaryTreeInversion {
    companion object {
        fun <T> inversion(node: TreeNode<T>?): TreeNode<T>? {
            if(node != null) {
                inversionWork(node)
            }
            return node
        }

        private fun <T> inversionWork(node: TreeNode<T>?) {
            node?.left = node?.right.also { node?.right = node?.left }

            if(node?.left != null) {
                inversionWork(node.left)
            }

            if(node?.right != null) {
                inversionWork(node.right)
            }
        }
    }


}