package com.albion.labs.reactivex

import org.junit.Test

class RxExamplesTest {

    @Test
    fun testBasicList() {
        val array = arrayOf(1,10,100,1000,10000)
        RxExamples.testBasicList(array)
    }

    @Test
    fun testBasicArray() {
        val array = arrayOf(1,10,100,1000,10000)
        RxExamples.testBasicArray01(array)
    }

    @Test
    fun testBasicArrayV2() {
        RxExamples.testBasicArray02()
    }

    @Test
    fun testFlatmap01() {
        RxExamples.testFlatmap01()
    }

    @Test
    fun testFlatmap02() {
        RxExamples.testFlatmap02()
    }

    @Test
    fun testZip01() {
        RxExamples.testZip()
    }

    @Test
    fun testCombineLastInterval01() {
        RxExamples.testCombineLastInterval()
    }

    @Test
    fun testReduce01() {
        RxExamples.testReduce()
    }
}