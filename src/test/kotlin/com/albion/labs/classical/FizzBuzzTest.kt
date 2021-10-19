package com.albion.labs.classical

import org.junit.Assert
import org.junit.Test

class FizzBuzzTest {

    @Test
    fun testFizzBuzz() {
        val fizzBuzz = FizzBuzz()
        val actual = fizzBuzz.fizzBuzz(5)
        val expected = mutableListOf("1", "2", "Fizz", "4", "Buzz")
        Assert.assertArrayEquals(actual.toTypedArray(), expected.toTypedArray())
        println(actual)
    }

    @Test
    fun testFizzBuzzV2() {
        val fizzBuzz = FizzBuzz()
        val actual = fizzBuzz.fizzBuzzV2(5)
        val expected = mutableListOf("1", "2", "Fizz", "4", "Buzz")
        Assert.assertArrayEquals(actual.toTypedArray(), expected.toTypedArray())
    }

    @Test
    fun testFizzBuzzV3() {
        val fizzBuzz = FizzBuzz()
        val actual = fizzBuzz.fizzBuzzV3(5)
        val expected = mutableListOf("1", "2", "Fizz", "4", "Buzz")
        Assert.assertArrayEquals(actual.toTypedArray(), expected.toTypedArray())
    }
}