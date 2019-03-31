package com.albion.labs.tree.bst

import com.albion.tree.bst.BinaryTreePrinter
import org.junit.Test


internal class HeightBalancedTreeTest {

    @Test
    fun sortedArrayToBST() {
        val input = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
        val hbt = HeightBalancedTree()
        val root = hbt.sortedArrayToBST(input)
        BinaryTreePrinter.printNode(root!!)
    }
}