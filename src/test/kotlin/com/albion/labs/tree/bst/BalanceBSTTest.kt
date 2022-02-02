package com.albion.labs.tree.bst

import com.albion.util.tree.bst.BinarySearchTree
import com.albion.util.tree.bst.BinaryTreePrinter
import org.junit.Test

class BalanceBSTTest {

    @Test
    fun testBasic() {
        val bst = BinarySearchTree<Int>()
        with(bst) {
            insert(1)
            insert(2)
            insert(3)
            insert(4)
        }
        bst.root?.let {
            println("====== Before ======")
            BinaryTreePrinter.printNode(it)
        }
        val balance = BalanceBST()
        val result = balance.balanceBST(bst.root!!)
        result?.let {
            println("====== After ======")
            BinaryTreePrinter.printNode(it)
        }
    }
}