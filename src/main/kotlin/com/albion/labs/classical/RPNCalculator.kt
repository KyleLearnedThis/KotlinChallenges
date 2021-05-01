package com.albion.labs.classical

class RPNCalculator {
    companion object {
        fun evaluate(input: Array<String>): Int {
            val operators = mutableListOf("+", "-", "*", "/")
            val stack = mutableListOf<Int>()

            for(token in input) {
                if(!operators.contains(token)) {
                    val n = token.toInt()
                    stack.add(n)
                } else {
                    if(stack.size >= 2) {
                        val x1 = stack.last()
                        stack.removeAt(stack.lastIndex)
                        val x2 = stack.last()
                        stack.removeAt(stack.lastIndex)
                        val currentResult = computeExpression(x1, x2, token)
                        stack.add(currentResult)
                    }
                }
            }
            return stack.last()
        }

        private fun computeExpression(val1: Int, val2: Int, operator: String): Int {
            return when (operator) {
                "+" -> {val1 + val2}
                "-" -> {val1 - val2}
                "*" -> {val1 * val2}
                "/" -> {val1 / val2}
                else -> {throw RuntimeException("Invalid Operator: $operator")}
            }
        }
    }
}