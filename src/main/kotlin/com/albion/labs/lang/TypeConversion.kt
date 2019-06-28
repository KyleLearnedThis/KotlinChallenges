package com.albion.labs.lang

class TypeConversion {
    fun conversion(number: String) {
        val i = number.toInt()
        println("Int: $i")

        val s = i.toString()
        println("String: $s")
    }
}