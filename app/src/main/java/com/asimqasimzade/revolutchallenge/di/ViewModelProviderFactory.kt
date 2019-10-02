package com.asimqasimzade.revolutchallenge.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ViewModelProviderFactory<VMType: ViewModel>(private val mViewModel: VMType): ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(mViewModel::class.java)) {
            return mViewModel as T
        }

        throw IllegalArgumentException("Unknown class name")
    }
}