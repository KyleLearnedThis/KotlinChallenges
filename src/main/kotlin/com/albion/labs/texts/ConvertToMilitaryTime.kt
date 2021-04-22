package com.albion.labs.texts

import java.lang.StringBuilder

// https://www.hackerrank.com/challenges/time-conversion/problem
class ConvertToMilitaryTime {
    companion object {
        fun timeConversion(s: String): String {
            val inputs = s.split(":")
            val seconds = inputs.last()
            val isPM = !seconds.contains("AM")
            var h = inputs.first().toInt()
            h = if(h == 12) {
                if(isPM) {
                    h
                } else {
                    h - 12
                }
            } else {
                if(isPM) {
                    h + 12
                } else {
                    h
                }
            }
            val builder = StringBuilder()

            val hours = if(h < 10) {
                "0$h"
            } else {
                "$h"
            }
            builder.append(hours)
            builder.append(":")
            builder.append(inputs[1])
            builder.append(":")
            builder.append(seconds.subSequence(0, 2))
            return builder.toString()
        }
    }
}