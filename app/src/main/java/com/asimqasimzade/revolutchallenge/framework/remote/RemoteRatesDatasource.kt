package com.asimqasimzade.revolutchallenge.framework.remote

import com.asimqasimzade.revolutchallenge.core.data.RatesDataSource
import com.asimqasimzade.revolutchallenge.core.data.model.CurrencyName
import javax.inject.Inject

class RemoteRatesDatasource @Inject constructor(private val rateService: RatesService) :
    RatesDataSource {
    override fun getRates(baseCurrencyName: CurrencyName) = rateService.getRates(baseCurrencyName)
}