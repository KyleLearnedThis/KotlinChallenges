package com.albion.labs.network.basic

import com.albion.labs.network.data.ChuckNorrisJoke
import com.google.gson.Gson
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import okhttp3.Call
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response


class HttpClientExample {
    fun httpGet(urlString: String): String {
        val client = OkHttpClient()
        val request: Request = Request.Builder()
                .url(urlString)
                .build()
        val call: Call = client.newCall(request)
        val response: Response = call.execute()
        val body = response.body!!
        return body.string()
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