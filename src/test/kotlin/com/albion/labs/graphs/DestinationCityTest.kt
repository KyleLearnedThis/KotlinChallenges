package com.albion.labs.graphs

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class DestinationCityTest {

    @Test
    fun destCity() {
        val paths = listOf(
            listOf("London","New York"),
            listOf("New York","Lima"),
            listOf("Lima","Sao Paulo")
        )
        val expected = "Sao Paulo"
        val actual = DestinationCity.destCity(paths)
        assertEquals(expected, actual)
    }
}