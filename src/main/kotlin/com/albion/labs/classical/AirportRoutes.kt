package com.albion.labs.classical

class AirportRoutes(private val shortTrips: Array<Array<String>> ){
    private val routeMap = mutableMapOf<String, String>()

    fun makeRoutes() : MutableList<String> {
        for(trip in shortTrips) {
            if( trip.size == 2) {
                val from = trip[0]
                val to = trip[1]
                routeMap[from] = to
            }
        }
        val list = mutableListOf<String>()
        val startingPoint = findStartingPoint(routeMap)
        list.add(startingPoint)

        var here = startingPoint
        for(i in 0 until routeMap.size) {
            val next = routeMap[here] ?: ""
            if(next.isNotEmpty()){
                list.add(next)
                here = next
            }
        }
        return list
    }

    private fun findStartingPoint(map: MutableMap<String, String>) : String {
        val values = map.values
        val keys = map.keys
        for(key in keys) {
            if(!values.contains(key)) {
                return key
            }
        }
        return ""
    }
}