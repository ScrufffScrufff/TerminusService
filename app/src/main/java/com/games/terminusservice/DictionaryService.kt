package com.games.terminusservice

import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

class DictionaryService {
    fun callDict(word:String):Response{
        val client = OkHttpClient()
        val url = "https://www.dictionaryapi.com/api/v3/references/collegiate/json/" + word + "?key=ca0c5760-d1de-43c3-a5d0-3fdea9f36e05"
        val request = Request.Builder()
            .url(url)
            .get()
            .build()
        val response = client.newCall(request).execute()
        return response
    }
}