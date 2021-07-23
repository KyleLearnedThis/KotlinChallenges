package com.albion.labs.matrix

class SpiralMatrix {
    companion object {
        fun spiralOrder(matrix: Array<IntArray>): List<Int> {
            val result: MutableList<Int> = ArrayList()
            if (matrix == null || matrix.isEmpty() || matrix[0].count() == 0) {
                return result
            }
            var d = matrix.size
            var r: Int = matrix[0].count()
            var i: Int
            var u = 0
            var l = 0
            /**
             * u - starting row index
             * d - ending row index
             * l - starting column index
             * r - ending column index
             * i - iterator
             */
            while (u < d && l < r) {
                /* Print the first row from the remaining rows */
                i = l
                while (i < r) {

                    // System.out.print(" " + matrix[u][i]);
                    result.add(matrix[u][i])
                    i++
                }
                u++

                /* Print the last column from the remaining columns */i = u
                while (i < d) {

                    // System.out.print(" " + matrix[i][r - 1]);
                    result.add(matrix[i][r - 1])
                    i++
                }
                r--

                /* Print the last row from the remaining rows */if (u < d) {
                    i = r - 1
                    while (i >= l) {

                        // System.out.print(" " + matrix[d - 1][i]);
                        result.add(matrix[d - 1][i])
                        i--
                    }
                    d--
                }

                /* Print the first column from the remaining columns */if (l < r) {
                    i = d - 1
                    while (i >= u) {

                        // System.out.print(" " + matrix[i][l]);
                        result.add(matrix[i][l])
                        i--
                    }
                    l++
                }
            }
            return result
        }
    }
}