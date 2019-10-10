package com.asimqasimzade.revolutchallenge.core.domain

import com.asimqasimzade.revolutchallenge.core.data.RatesRepository
import com.asimqasimzade.revolutchallenge.core.data.RatesResponseToRateModelListMapper
import com.asimqasimzade.revolutchallenge.core.data.model.CurrencyName
import javax.inject.Inject

class GetRatesUseCase @Inject constructor(
    private val ratesRepository: RatesRepository,
    private val ratesResponseToRateModelListMapper: RatesResponseToRateModelListMapper
) {
    fun execute(baseCurrencyName: CurrencyName) =
        ratesRepository.getRates(baseCurrencyName).map {ratesResponse ->
            ratesResponseToRateModelListMapper.map(ratesResponse)
        }
}