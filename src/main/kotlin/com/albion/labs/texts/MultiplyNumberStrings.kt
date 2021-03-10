package com.albion.labs.texts

/**
 * https://practice.geeksforgeeks.org/problems/multiply-two-strings/
 */
class MultiplyNumberStrings {
    companion object {
        fun multiply(num1: String, num2: String): String {
            val len1 = num1.length
            val len2 = num2.length
            if (len1 == 0 || len2 == 0) {
                return "0"
            }

            val result = IntArray(len1 + len2)
            var iN1 = 0
            var iN2: Int

            (len1 - 1 downTo 0).forEach { i ->
                var carry = 0
                val n1 = num1[i] - '0'
                iN2 = 0
                for (j in len2 - 1 downTo 0) {
                    val n2 = num2[j] - '0'
                    val sum = n1 * n2 + result[iN1 + iN2] + carry
                    carry = sum / 10
                    result[iN1 + iN2] = sum % 10
                    iN2++
                }

                if (carry > 0) {
                    result[iN1 + iN2] += carry
                }
                iN1++
            }


            var i = result.size - 1
            while (i >= 0 && result[i] == 0) {
                i--
            }

            if (i == -1) {
                return "0"
            }

            var s = ""
            while (i >= 0) {
                s += result[i--]
            }
            return s
        }
    }
}