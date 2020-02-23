package com.albion.labs.network.retrofit

import com.albion.labs.network.data.ChuckNorrisJoke
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ChuckNorrisJokeService {

    @GET("/jokes/random")
    fun getRandomJoke(): Call<ChuckNorrisJoke>

    companion object {
        fun create(): ChuckNorrisJokeService {
            val retrofit = Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://api.chucknorris.io/")
                    .build()
            return retrofit.create(ChuckNorrisJokeService::class.java)
        }
    }
}