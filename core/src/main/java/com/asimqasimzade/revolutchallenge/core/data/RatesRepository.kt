package com.asimqasimzade.revolutchallenge.core.data

import com.asimqasimzade.revolutchallenge.core.data.RatesDataSource
import com.asimqasimzade.revolutchallenge.core.data.model.CurrencyName
import javax.inject.Inject

class RatesRepository @Inject constructor(private val ratesDataSource: RatesDataSource) {
    fun getRates(baseCurrencyName: CurrencyName) = ratesDataSource.getRates(baseCurrencyName)
}