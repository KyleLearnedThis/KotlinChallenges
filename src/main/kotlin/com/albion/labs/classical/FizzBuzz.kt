package com.albion.labs.classical

class FizzBuzz {
    fun fizzBuzz(n: Int): List<String> {
        val list = mutableListOf<String>()
        if (n <= 0) {
            return list
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
                i.toString()
            }
            list.add(current)
        }
        return list
    }

    fun fizzBuzzV2(n: Int): List<String> {
        val list = (1..n).toList()
        val words = arrayOf("Fizz", "Buzz", "FizzBuzz")
        return list.map {
            if(it % 3 == 0 && it % 5 == 0) {
                words[2]
            } else if (it % 3 == 0) {
                words[0]
            } else if (it % 5 == 0){
                words[1]
            } else {
                it.toString()
            }
        }
    }

    fun fizzBuzzV3(n: Int): List<String> {
        return IntArray(n) { i -> i + 1 }
            .map { i ->
                mapOf(0 to i, i % 3 to "Fizz", i % 5 to "Buzz", i % 15 to "FizzBuzz")[0]
            }.map { it.toString() }
    }
}
