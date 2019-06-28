package com.albion.labs.lang

class StringManipulations {
    companion object {
        fun substringV1() {
            val input = "Super Mario Brothers"
            val l = input.indexOfFirst { char -> char == 'S' }
            val r = input.indexOfFirst { char -> char == 'r' }
            val substring = input.substring(l, r+1)
            println("===== substringV1: $substring =====")
        }

        fun substringV2() {
            val input = "Super Mario Brothers"
            val substring = input.substringAfter("S").substringBefore("r")
            println("===== substringV1: $substring =====")
        }

        fun splitIntoArrays(input: String, deliminator: String): MutableList<Int> {
            val x = input.split(deliminator)
            val y = x.toMutableList()
            return y.map {it.toInt()}.toMutableList()
        }
    }
}