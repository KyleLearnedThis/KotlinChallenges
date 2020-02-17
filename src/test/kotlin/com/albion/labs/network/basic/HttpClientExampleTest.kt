package com.albion.labs.network.basic

import org.junit.Assert
import org.junit.Test

class HttpClientExampleTest {

    @Test
    fun testBasic() {
        val example = HttpClientExample()
        val body = example.httpGet("http://m.cnn.com/en")
        val expected = "CNN"
        val result = body.contains(expected)
        Assert.assertTrue(result)
    }

    @Test
    fun testRxBasic() {
        val example = HttpClientExample()
        example.rxHttpGet("http://m.cnn.com/en")
        Thread.sleep(3000)
    }

    @Test
    fun testChuckJson() {
        val example = HttpClientExample()
        example.httpGetChuckNorrisJoke("https://api.chucknorris.io/jokes/random")
        Thread.sleep(3000)
    }
}