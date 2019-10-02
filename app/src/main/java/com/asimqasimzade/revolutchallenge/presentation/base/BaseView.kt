package com.asimqasimzade.revolutchallenge.presentation.base

import androidx.lifecycle.ViewModel

interface BaseView<T: ViewModel> {
    val viewModel: T
    val bindingLayout: Int
}