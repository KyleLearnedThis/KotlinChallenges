package com.albion.labs.tree.bst

import com.albion.tree.bst.BinarySearchTree
import com.albion.tree.bst.BinaryTreePrinter
import com.albion.tree.bst.TreeNode
import org.junit.Assert
import org.junit.Test

class TreeDepthTest {

    @Test
    fun minDepth() {
        val root = makeTree()
        val td = TreeDepth()
        val actual = td.minDepth(root)
        val expected = 3
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun maxDepth() {
        val root = makeTree()
        val td = TreeDepth()
        val actual = td.maxDepth(root)
        val expected = 5
        Assert.assertEquals(expected, actual)
    }

    private fun makeTree(): TreeNode<Int>? {
        val input = arrayListOf(15, 6, 18, 3, 7, 17, 20, 2, 4, 13, 9)
        val bst =  BinarySearchTree<Int>()
        for (i in input) {
            bst.insert(i)
        }
        val root = bst.root!!
        BinaryTreePrinter.printNode(root)
        return root
    }
}