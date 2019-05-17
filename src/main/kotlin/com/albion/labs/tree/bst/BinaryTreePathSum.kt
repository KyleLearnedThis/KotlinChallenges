package com.albion.labs.tree.bst

import com.albion.tree.bst.TreeNode
import java.util.*

class BinaryTreePathSum {

    fun pathSum(root: TreeNode<Int>?, sum: Int): ArrayList<ArrayList<Int>> {
        val result = ArrayList<ArrayList<Int>>()
        if (root == null) {
            return result
        }

        val list = ArrayList<Int>()
        list.add(root.data)
        dfs(root, sum - root.data, result, list)
        return result
    }

    private fun dfs(t: TreeNode<Int>?, sum: Int, result: ArrayList<ArrayList<Int>>, list: ArrayList<Int>) {
        val left = t?.left
        val right = t?.right

        if (left == null && right == null && sum == 0) {
            val temp = ArrayList(list)
            result.add(temp)
        }

        //search path of left node
        if (left != null) {
            val leftList = ArrayList(list)
            leftList.add(left.data)
            dfs(left, sum - left.data, result, leftList)
        }

        //search path of right node
        if (right != null) {
            val rightList = ArrayList(list)
            rightList.add(right.data)
            dfs(right, sum - t.right!!.data, result, rightList)
        }
    }

    fun printAllPaths(lists: ArrayList<ArrayList<Int>>) {
        for (list in lists) {
            for (i in list) {
                print(" $i")
            }
            println("")
        }
    }

}