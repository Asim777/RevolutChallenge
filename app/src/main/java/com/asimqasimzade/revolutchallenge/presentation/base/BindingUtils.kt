package com.asimqasimzade.revolutchallenge.presentation.base

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.asimqasimzade.revolutchallenge.core.data.model.RateModel
import com.asimqasimzade.revolutchallenge.presentation.converter.RatesAdapter

@BindingAdapter("data")
fun <T> setRecyclerViewProperties(recyclerView: RecyclerView, items: List<RateModel>) {
    if (recyclerView.adapter is RatesAdapter) {
        (recyclerView.adapter as RatesAdapter).setData(items)
    }
}