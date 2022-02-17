package com.games.terminusservice

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
data class Junk(
    val meta: String,
    val id: String,
    val uuid: String,
    val sort: String,
    val src: String,
    val section: String,
    val stems: Array<String>,
    val offensive: Boolean,
)
