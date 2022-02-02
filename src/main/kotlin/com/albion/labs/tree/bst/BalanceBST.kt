package com.albion.labs.tree.bst

import com.albion.util.tree.bst.TreeNode

// https://leetcode.com/problems/balance-a-binary-search-tree/
class BalanceBST {
    val list: MutableList<Int> = mutableListOf()
    fun balanceBST(root: TreeNode<Int>?): TreeNode<Int>? {
        if (root == null) {
            return null
        }
        if (root.left == null && root.right == null) {
            return root
        }
        getAllNodes(root)
        list.sort()
        val input = list.toTypedArray().toIntArray()
        val tree = HeightBalancedTree()
        return tree.sortedArrayToBST(input)
    }

    private fun getAllNodes(root: TreeNode<Int>?) {
        if(root == null) {
            return
        }
        getAllNodes(root.left)
        list.add(root.data)
        getAllNodes(root.right)
    }
}