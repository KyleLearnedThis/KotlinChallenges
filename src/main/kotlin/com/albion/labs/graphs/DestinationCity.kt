package com.albion.labs.graphs

// https://leetcode.com/problems/destination-city/
class DestinationCity {
    companion object {
        fun destCity(paths: List<List<String>>): String {
            val routes = mutableMapOf<String, String>()
            for (path in paths) {
                if (path.count() >= 2) {
                    val first = path.first()
                    val last = path.last()
                    routes[first] = last
                }
            }

            val src = routes.keys.toSortedSet()
            val dest = routes.values.toSortedSet()
            return dest.subtract(src).toTypedArray()[0]
        }
    }
}