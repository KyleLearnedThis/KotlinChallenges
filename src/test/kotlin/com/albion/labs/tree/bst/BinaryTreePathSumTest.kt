package com.albion.labs.tree.bst

import com.albion.tree.bst.BinaryTreePrinter
import com.albion.tree.bst.TreeNode
import org.junit.Assert
import org.junit.Test
import java.util.*

class BinaryTreePathSumTest {

    private fun makeTree(): TreeNode<Int> {
        val root = TreeNode(5)
        val t04a = TreeNode(4)
        val t08 = TreeNode(8)
        val t11 = TreeNode(11)
        val t13 = TreeNode(13)
        val t04b = TreeNode(4)
        val t07 = TreeNode(7)
        val t02 = TreeNode(2)
        val t05 = TreeNode(5)
        val t01 = TreeNode(1)
        /*
		 *    5
			 / \
			4   8
		   /   / \
		  11  13  4
		 /  \    / \
		7    2  5   1
		 */
        root.left = t04a
        root.right = t08

        t04a.left = t11
        t08.left = t13
        t08.right = t04b

        t11.left = t07
        t11.right = t02

        t04b.left = t05
        t04b.right = t01
        return root
    }

    @Test
    fun testPathSumBasic() {
        val root = makeTree()
        BinaryTreePrinter.printNode(root!!)
        val ps = BinaryTreePathSum()
        val sum = 22
        val actual = ps.pathSum(root, sum)
        val expected = ArrayList<ArrayList<Int>>()
        val x1 = intArrayOf(5, 4, 11, 2).let { intList ->
            ArrayList<Int>(intList.size).apply { intList.forEach { add(it) } }
        }
        val x2 = intArrayOf(5, 8, 4, 5).let { intList ->
            ArrayList<Int>(intList.size).apply { intList.forEach { add(it) } }
        }

        expected.add(x1)
        expected.add(x2)

        Assert.assertEquals(expected.size, actual.size)
        ps.printAllPaths(actual)

        for (i in expected.indices) {
            val x = expected.get(i)
            val y = actual[i]
            val result = x.containsAll(y) && y.containsAll(x)
            Assert.assertTrue(result)
        }
    }
}