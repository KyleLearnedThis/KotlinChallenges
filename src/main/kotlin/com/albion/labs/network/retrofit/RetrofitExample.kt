package com.albion.labs.network.retrofit


class RetrofitExample {
    companion object {
        fun getRandomChuckJoke() {
            val service = ChuckNorrisJokeService.create()
            val x = service.getRandomJoke().execute().body()!!
            println("====== ${x.value} ======")
        }
    }
}