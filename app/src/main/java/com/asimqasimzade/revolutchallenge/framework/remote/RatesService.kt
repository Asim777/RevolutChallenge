package com.asimqasimzade.revolutchallenge.framework.remote

import com.asimqasimzade.revolutchallenge.core.data.model.CurrencyName
import com.asimqasimzade.revolutchallenge.core.data.model.RatesResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface RatesService {

    companion object {
        const val BASE_URL = "https://revolut.duckdns.org"
    }

    @GET("/latest")
    fun getRates(@Query("base") baseCurrency: CurrencyName): Single<RatesResponse>
}