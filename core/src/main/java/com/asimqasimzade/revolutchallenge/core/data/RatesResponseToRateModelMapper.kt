package com.asimqasimzade.revolutchallenge.core.data

import com.asimqasimzade.revolutchallenge.core.data.model.CurrencyFlag
import com.asimqasimzade.revolutchallenge.core.data.model.CurrencyModel
import com.asimqasimzade.revolutchallenge.core.data.model.CurrencyName
import com.asimqasimzade.revolutchallenge.core.data.model.RatesResponse
import com.asimqasimzade.revoluttest.data.model.*

class RatesResponseToRateModelListMapper {
    fun map(ratesResponse: RatesResponse): List<RateModel> {
        val ratesList = mutableListOf<RateModel>()
        ratesResponse.rates.forEach { (code, rate) ->
            val currencyModel = getCurrencyModel(code)
            val rateModel = RateModel(currencyModel, rate)
            ratesList.add(rateModel)
        }
        return ratesList
    }

    private fun getCurrencyModel(code: String) =
        CurrencyModel(
            getCurrencyFlag(code),
            code,
            getCurrencyName(code)
        )

    private fun getCurrencyName(code: String) =
        when (code) {
            "AUD" -> CurrencyName.AUD
            "BGN" -> CurrencyName.BGN
            "BRL" -> CurrencyName.BRL
            "CAD" -> CurrencyName.CAD
            "CHF" -> CurrencyName.CHF
            "CNY" -> CurrencyName.CNY
            "CZK" -> CurrencyName.CZK
            "DKK" -> CurrencyName.DKK
            "EUR" -> CurrencyName.EUR
            "GBP" -> CurrencyName.GBP
            "HKD" -> CurrencyName.HKD
            "HRK" -> CurrencyName.HRK
            "HUF" -> CurrencyName.HUF
            "IDR" -> CurrencyName.IDR
            "ILS" -> CurrencyName.ILS
            "INR" -> CurrencyName.INR
            "ISK" -> CurrencyName.ISK
            "JPY" -> CurrencyName.JPY
            "KRW" -> CurrencyName.KRW
            "MXN" -> CurrencyName.MXN
            "MYR" -> CurrencyName.MYR
            "NOK" -> CurrencyName.NOK
            "NZD" -> CurrencyName.NZD
            "PHP" -> CurrencyName.PHP
            "PLN" -> CurrencyName.PLN
            "RON" -> CurrencyName.RON
            "RUB" -> CurrencyName.RUB
            "SEK" -> CurrencyName.SEK
            "SGD" -> CurrencyName.SGD
            "THB" -> CurrencyName.THB
            "TRY" -> CurrencyName.TRY
            "USD" -> CurrencyName.USD
            "ZAR" -> CurrencyName.ZAR
            else -> CurrencyName.UNKNOWN
        }

    private fun getCurrencyFlag(code: String) =
        when (code) {
            "AUD" -> CurrencyFlag.AUD
            "BGN" -> CurrencyFlag.BGN
            "BRL" -> CurrencyFlag.BRL
            "CAD" -> CurrencyFlag.CAD
            "CHF" -> CurrencyFlag.CHF
            "CNY" -> CurrencyFlag.CNY
            "CZK" -> CurrencyFlag.CZK
            "DKK" -> CurrencyFlag.DKK
            "EUR" -> CurrencyFlag.EUR
            "GBP" -> CurrencyFlag.GBP
            "HKD" -> CurrencyFlag.HKD
            "HRK" -> CurrencyFlag.HRK
            "HUF" -> CurrencyFlag.HUF
            "IDR" -> CurrencyFlag.IDR
            "ILS" -> CurrencyFlag.ILS
            "INR" -> CurrencyFlag.INR
            "ISK" -> CurrencyFlag.ISK
            "JPY" -> CurrencyFlag.JPY
            "KRW" -> CurrencyFlag.KRW
            "MXN" -> CurrencyFlag.MXN
            "MYR" -> CurrencyFlag.MYR
            "NOK" -> CurrencyFlag.NOK
            "NZD" -> CurrencyFlag.NZD
            "PHP" -> CurrencyFlag.PHP
            "PLN" -> CurrencyFlag.PLN
            "RON" -> CurrencyFlag.RON
            "RUB" -> CurrencyFlag.RUB
            "SEK" -> CurrencyFlag.SEK
            "SGD" -> CurrencyFlag.SGD
            "THB" -> CurrencyFlag.THB
            "TRY" -> CurrencyFlag.TRY
            "USD" -> CurrencyFlag.USD
            "ZAR" -> CurrencyFlag.ZAR
            else -> CurrencyFlag.UNKNOWN
        }
}