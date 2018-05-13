package com.albion.labs.classical

import org.junit.Assert
import org.junit.Test

class AirportRoutesTest {

    @Test
    fun testMakeRoutes() {
        val input = arrayOf(
                arrayOf("SFO", "YVR"),
                arrayOf("YVR", "JFK"),
                arrayOf("JFK", "CDG"),
                arrayOf("CDG", "HEL")
        )
        val airportRoutes = AirportRoutes(input)
        val actual = airportRoutes.makeRoutes()
        val expected = mutableListOf("SFO", "YVR", "JFK", "CDG", "HEL")
        Assert.assertEquals(actual, expected)
    }
}