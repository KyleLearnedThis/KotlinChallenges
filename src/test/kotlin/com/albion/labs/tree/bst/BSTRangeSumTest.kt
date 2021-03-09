package com.albion.labs.tree.bst

import com.albion.util.tree.bst.BinarySearchTree
import com.albion.util.tree.bst.BinaryTreePrinter
import org.junit.Assert
import org.junit.Test

class BSTRangeSumTest {

    @Test
    fun rangeSum() {
        val input = arrayOf(10, 15, 5, 7,3,18)
        val tree = BinarySearchTree<Int>()
        for(i in input) {
            tree.insert(i)
        }
        val root = tree.root!!
        BinaryTreePrinter.printNode(root)
        val actual = BSTRangeSum.rangeSumBST(root, 7, 15)
        val expected = 32
        Assert.assertEquals(expected, actual)
    }
}