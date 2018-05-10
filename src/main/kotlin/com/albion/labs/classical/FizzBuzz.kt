package com.albion.labs.classical

class FizzBuzz {
    fun fizzBuzz(n: Int): List<String> {
        val list = mutableListOf<String>()
        if (n <= 0) {
            list
        }
        val words = arrayOf("Fizz", "Buzz", "FizzBuzz")
        for (i in 1..n) {
            val current = if (i % 3 == 0 && i % 5 == 0) {
                words[2]
            } else if (i % 3 == 0) {
                words[0]
            } else if (i % 5 == 0) {
                words[1]
            } else {
                Integer.toString(i)
            }
            list.add(current)
        }
        return list
    }
}
