package com.asimqasimzade.revolutchallenge.core.data

import com.asimqasimzade.revolutchallenge.core.data.model.CurrencyName
import com.asimqasimzade.revolutchallenge.core.data.model.RatesResponse
import io.reactivex.Single

interface RatesDataSource {
    fun getRates(baseCurrencyName: CurrencyName): Single<RatesResponse>
}