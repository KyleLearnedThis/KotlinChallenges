package com.albion.labs.tree.bst

import com.albion.util.tree.bst.TreeNode

class AllPaths {
    companion object {
        fun binaryTreePaths(root: TreeNode<Int>?): MutableList<MutableList<Int>> {
            val result = mutableListOf<MutableList<Int>>()
            val list = mutableListOf<Int>()

            if (root == null) {
                return result
            } else {
                dfs(root, result, list)
            }
            return result
        }

        private fun dfs(root: TreeNode<Int>?, allPaths: MutableList<MutableList<Int>>, path: MutableList<Int>) {
            val cur: TreeNode<Int>? = root
            if (cur != null) {
                path.add(cur.data)
            }

            if (cur?.left == null && cur?.right == null) {
                allPaths.add(path)
            }

            if (cur?.left != null) {
                val temp = mutableListOf<Int>().apply {
                    addAll(path)
                }
                val left = cur.left
                dfs(left, allPaths, temp)
            }

            if (cur?.right != null) {
                val temp = mutableListOf<Int>().apply {
                    addAll(path)
                }
                val right = cur.right
                dfs(right, allPaths, temp)
            }
        }
    }
}