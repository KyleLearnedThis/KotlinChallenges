package com.albion.labs.matrix

// https://leetcode.com/problems/matrix-diagonal-sum/

class MatrixDiagonalSum {
    companion object {
        fun diagonalSum(mat: Array<IntArray>): Int {
            if (mat.size == 1) {
                return mat[0][0]
            }
            val centerValue = if (mat.size % 2 == 1) {
                mat[mat.size / 2][mat.size / 2]
            } else {
                0
            }

            var primaryValue = 0
            var secondaryValue = 0
            for (x in mat.indices) {
                val curV1 = mat[x][x]
                val curV2 = mat[mat.size - 1 - x][x]
                primaryValue += curV1
                secondaryValue += curV2
            }
            return primaryValue + secondaryValue - centerValue
        }
    }
}