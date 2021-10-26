package com.albion.labs.classical

class AirportRoutes(private val shortTrips: Array<Array<String>> ){
    private val routeMap = mutableMapOf<String, String>()

    fun makeRoutes() : MutableList<String> {
        for(trip in shortTrips) {
            if( trip.size >= 2) {
                val from = trip.first()
                val to = trip.last()
                routeMap[from] = to
            }
        }
        val list = mutableListOf<String>()
        val startingPoint = findStartingPoint(routeMap)
        list.add(startingPoint)

        var here = startingPoint
        routeMap.forEach { _ ->
            val next = routeMap.getOrDefault(here, "")
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