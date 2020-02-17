package com.albion.labs.network.data

data class ChuckNorrisJoke(
        val categories: Array<String>,
        val created_at: String,
        val icon_url: String,
        val id: String,
        val updated_at: String,
        val url: String,
        val value: String
)

/*
{
   "categories":[

   ],
   "created_at":"2020-01-05 13:42:25.628594",
   "icon_url":"https://assets.chucknorris.host/img/avatar/chuck-norris.png",
   "id":"Z6UwulXoQPGoOOi2bKoO-g",
   "updated_at":"2020-01-05 13:42:25.628594",
   "url":"https://api.chucknorris.io/jokes/Z6UwulXoQPGoOOi2bKoO-g",
   "value":"Chuck Norris doesn't need haircuts because his hair knows when to back down."
}
 */