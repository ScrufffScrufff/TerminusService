package com.games.terminusservice
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import kotlinx.serialization.*
import kotlinx.serialization.json.Json


class TerminusService

fun main(args :Array<String>){
    val dicserv = DictionaryService()
    val resp = dicserv.callDict("cat")
    val authResp =
        jacksonObjectMapper().readValue(resp.body!!.string(), Junk::class.java)
    println(authResp)

}
