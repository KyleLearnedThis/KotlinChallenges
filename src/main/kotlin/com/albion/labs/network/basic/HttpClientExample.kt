package com.albion.labs.network.basic

import com.albion.labs.network.data.ChuckNorrisJoke
import com.google.gson.Gson
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

class HttpClientExample {
    fun httpGet(urlString: String): String {
        val client = HttpClient.newBuilder().build()
        val request = HttpRequest.newBuilder()
                .uri(URI(urlString))
                .build()
        val response = client.send(request, HttpResponse.BodyHandlers.ofString())
        return response.body().toString()
    }

    fun rxHttpGet(urlString: String) {
        Observable.fromCallable { httpGet(urlString) }
                .subscribeOn(Schedulers.io())
                .subscribe {
                    print("====== $it ======")
                }
    }

    fun httpGetChuckNorrisJoke(urlString: String) {
        val input = httpGet(urlString)
        val parser = Gson()
        val joke = parser.fromJson<ChuckNorrisJoke>(input, ChuckNorrisJoke::class.java)!!
        println("===== ${joke.value} =====")
    }
}