package com.albion.labs.numbers

/**
 * Problem source: https://leetcode.com/problems/day-of-the-year/
 * Note that no leap year on centennial if it is not divisible by 400
 * Ex: 1900 is not a leap year, 2000 is.
 */
class DaysOfYear {
    companion object {
        val map = mapOf(
            1 to 31,
            2 to 28,
            3 to 31,
            4 to 30,
            5 to 31,
            6 to 30,
            7 to 31,
            8 to 31,
            9 to 30,
            10 to 31,
            11 to 30,
            12 to 31
        )
        fun dayOfYear(input: String): Int {
            val ymd = input.split("-")
            if(ymd.size != 3) {
                return 0
            }
            val year = ymd[0].toInt()
            val month = ymd[1].toInt()
            val date = ymd[2].toInt()
            return if(month == 1) {
                date
            } else {
                val sum = map.filter{it.key < month}
                    .map {it.value}
                    .reduce { acc, i -> acc + i }
                if(year % 4 == 0 && month >= 3) {
                    if (year % 100 == 0) {
                        if(year % 400 == 0) {
                            sum + date + 1
                        } else {
                            sum + date
                        }
                    } else {
                        sum + date + 1
                    }
                } else {
                    sum + date
                }
            }
        }
    }
}