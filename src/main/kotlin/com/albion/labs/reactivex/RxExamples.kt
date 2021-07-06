package com.albion.labs.reactivex

import io.reactivex.Observable
import io.reactivex.rxkotlin.Observables
import io.reactivex.rxkotlin.toMap
import java.lang.Thread.sleep
import java.util.concurrent.TimeUnit

class RxExamples {
    companion object {
        fun testBasicList(array: Array<Int>) {
            Observable.just(array.asList())
                    .flatMap { list -> Observable.fromIterable(list) }
                    .subscribe({ println("[$it]") }, { error: Throwable -> error.printStackTrace() })
                    { println("testBasicList: onComplete") }
        }

        fun testBasicArray01(array: Array<Int>) {
            val observable = Observable.fromArray<Int>(*array)
            observable.subscribe({ println("[$it]") }, { error: Throwable -> error.printStackTrace() }
            ) { println("testBasicArray: Done") }
        }

        fun testBasicArray02() {
            val array = arrayOf(5,2,3,6,1,4)
            val observable = Observable.fromArray<Int>(*array)
            observable.sorted()
                    .subscribe({ item: Int -> println("[$item]") }, { error: Throwable -> error.printStackTrace() }) {
                println("onComplete")
            }
        }

        fun testFlatmap01() {
            Observable.just("1/10/100/Alpha", "2/Beta", "3/30/Gamma")
                    .apply {
                        flatMap { s -> Observable.fromArray(*s.split("/".toRegex()).toTypedArray()) }
                        .filter { s -> s.matches("[0-9]+".toRegex()) }
                        .map { Integer.valueOf(it) }
                        .subscribe { println(it) }
            }
        }

        fun testFlatmap02() {
            val array = arrayOf("1/2/3/Alpha", "4/Beta", "5/6/Gamma")
            val source = Observable.fromArray(*array)
            source.flatMap { s -> Observable.fromArray(*s.split("/".toRegex()).toTypedArray()) }
                    .filter { s -> s.matches("[0-9]+".toRegex()) }
                    .map { return@map it.toInt() * it.toInt() }
                    .subscribe { println("== [$it] ==") }
        }

        fun testZip() {
            val src1 = Observable.just("JFK", "SFO", "CDG", "YVR")
            val src2 = Observable.just("John Kennedy", "San Francisco", "Charles de Gaulle", "Vancouver")
            val src3 = Observables.zip(src1, src2) { l, r -> Pair(l, r) }
                    .toMap()
                    .toObservable()
            src3.subscribe{
                it.forEach { println("[${it.key}]-[${it.value}]") }
            }
        }

        fun testCombineLastInterval() {
            val sec1 = Observable.interval(300, TimeUnit.MILLISECONDS)
            val sec2 = Observable.interval(1, TimeUnit.SECONDS)
            Observables.combineLatest(sec1, sec2) { i1, i2 ->
                "Source 1: $i1 Source 2: $i2"
            }.subscribe{ println(it) }
            sleep(3000)
        }

        fun testReduce() {
            val src = Observable.just(1, 10, 100, 1000, 10000, 100000)
            src.reduce(0) { l, r -> l + r }
                .toObservable()
                    .subscribe{ println("===== $it =====") }
        }
    }
}