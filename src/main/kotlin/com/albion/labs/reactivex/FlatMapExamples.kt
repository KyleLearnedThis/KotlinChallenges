package com.albion.labs.reactivex

import io.reactivex.Observable

class FlatMapExamples {
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
    }
}