package com.asimqasimzade.revoluttest.data.model

import com.asimqasimzade.revolutchallenge.core.data.model.CurrencyModel

data class RateModel(
    val currency: CurrencyModel,
    val rate: Float
)