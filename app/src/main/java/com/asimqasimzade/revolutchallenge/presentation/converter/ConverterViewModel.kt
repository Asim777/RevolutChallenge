package com.asimqasimzade.revolutchallenge.presentation.converter

import android.app.Application
import androidx.lifecycle.LiveData
import com.asimqasimzade.revolutchallenge.core.data.model.CurrencyName
import com.asimqasimzade.revolutchallenge.core.data.model.RateModel
import com.asimqasimzade.revolutchallenge.core.domain.GetRatesUseCase
import com.asimqasimzade.revolutchallenge.presentation.base.BaseViewModel
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

interface outputs {
    fun showRates(): Observable<List<RateModel>>
    fun updateRates(): LiveData<List<RateModel>>
    fun updateAmounts(): LiveData<List<RateModel>>
}

interface inputs {
    fun onBaseCurrencySelected()
    fun onInput()
}

class ConverterViewModel @Inject constructor(
    app: Application,
    private val getRatesUseCase: GetRatesUseCase
) :
    BaseViewModel(app),
    outputs,
    inputs {

    override fun showRates(baseCurrency: CurrencyName) =
        getRatesUseCase.execute(baseCurrency)
            .subscribeOn(Schedulers.io())
            .subscribe ({
                
            }, {

            })


    override fun updateRates(): LiveData<List<RateModel>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateAmounts(): LiveData<List<RateModel>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBaseCurrencySelected(): {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onInput() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}