package com.albion.labs.lang

import com.albion.labs.lang.data.Person

class MappingTransform {
    companion object {
        fun joinArraysIntoMap(keys: Array<String>, values: Array<Int>): MutableMap<String, Int> {
            return keys.zip(values).toMap().toMutableMap()
        }

        fun convertPersonArrayIntoMap(people: Array<Person>): MutableMap<String, Int> {
            return people.toMutableList().associate {Pair(it.name, it.id)}.toMutableMap()
        }

        fun printMap(map: MutableMap<String, Int>) {
            map.forEach{
                val n = it.key
                val v = it.value
                println("===== name: $n - value: $v =====")
            }
        }
    }
}