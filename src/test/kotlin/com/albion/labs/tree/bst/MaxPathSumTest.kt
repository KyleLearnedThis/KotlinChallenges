package com.albion.labs.tree.bst

import com.albion.util.tree.bst.BinaryTreePrinter
import org.junit.Test

import org.junit.Assert.*

class MaxPathSumTest {

    @Test
    fun maxPathSum() {
        val input = intArrayOf(1,2,3,4,5,6,7,8,9,10,11)
        val tree = HeightBalancedTree()
        val root = tree.sortedArrayToBST(input)
        BinaryTreePrinter.printNode(root!!)
        val expected = 48
        val actual = MaxPathSum.maxPathSum(root)
        assertEquals(expected, actual)
    }
}