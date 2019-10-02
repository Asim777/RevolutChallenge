package com.asimqasimzade.revolutchallenge.core.data.model

data class RatesResponse(
    val base: String,
    val date: String,
    val rates: Map<String, Float>
)