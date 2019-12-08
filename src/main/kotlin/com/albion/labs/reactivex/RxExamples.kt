package com.albion.labs.reactivex

import io.reactivex.Observable
import io.reactivex.rxkotlin.Observables
import io.reactivex.rxkotlin.toMap

class RxExamples {
    companion object {
        fun example001() {
            Observable.just("1/10/100/Alpha", "2/Beta", "3/30/Gamma")
                    .apply {
                        flatMap { s -> Observable.fromArray(*s.split("/".toRegex()).toTypedArray()) }
                        .filter { s -> s.matches("[0-9]+".toRegex()) }
                        .map { Integer.valueOf(it) }
                        .subscribe { println(it) }
            }
        }

        fun example002() {
            val src1 = Observable.just("JFK", "SFO", "CDG", "YVR")
            val src2 = Observable.just("John Kennedy", "San Francisco", "Charles de Gaulle", "Vancouver")
            Observables.zip(src1, src2) { l, r -> Pair(l, r) }
                    .toMap()
                    .toObservable()
                    .subscribe{
                        it.forEach { it ->
                            println("[${it.key}]-[${it.value}]")
                        }
                    }
        }
    }
}