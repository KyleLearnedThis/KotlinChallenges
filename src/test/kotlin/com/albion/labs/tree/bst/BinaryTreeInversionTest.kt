package com.albion.labs.tree.bst

import com.albion.util.tree.bst.BinarySearchTree
import com.albion.util.tree.bst.BinaryTreePrinter
import org.junit.Test

class BinaryTreeInversionTest {
    @Test
    fun testInversion() {
        val input = arrayListOf(15, 6, 18, 3, 7, 17, 20, 2, 4, 13, 9)
        val bst =  BinarySearchTree<Int>()
        for (i in input) {
            bst.insert(i)
        }
        var root = bst.root!!
        BinaryTreePrinter.printNode(root)

        root = BinaryTreeInversion.inversion(root)!!
        BinaryTreePrinter.printNode(root)
    }
}