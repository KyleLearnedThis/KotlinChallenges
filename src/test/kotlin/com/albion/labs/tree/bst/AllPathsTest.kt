package com.albion.labs.tree.bst

import com.albion.util.tree.bst.BinaryTreePrinter
import org.junit.Test

import org.junit.Assert.*

class AllPathsTest {

    @Test
    fun binaryTreePaths() {
        val input = intArrayOf(1,2,3,4,5,6,7,8,9,10,11)
        val tree = HeightBalancedTree()
        val root = tree.sortedArrayToBST(input)
        BinaryTreePrinter.printNode(root!!)
        val actual = AllPaths.binaryTreePaths(root)
        for(list in actual) {
            for(item in list) {
                if(item != list.last()) {
                    print("[$item]-")
                } else {
                    print("[$item]")
                }
            }
            println()
        }
    }
}