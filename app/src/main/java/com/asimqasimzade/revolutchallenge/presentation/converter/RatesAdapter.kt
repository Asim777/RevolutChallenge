package com.asimqasimzade.revolutchallenge.presentation.converter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.asimqasimzade.revolutchallenge.R
import com.asimqasimzade.revolutchallenge.core.data.model.RateModel
import com.asimqasimzade.revolutchallenge.databinding.RateItemBinding
import com.asimqasimzade.revolutchallenge.presentation.base.BindableAdapter

class RatesAdapter : RecyclerView.Adapter<RatesAdapter.RateHolder>(), BindableAdapter<List<RateModel>> {

    var rates = emptyList<RateModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RateHolder = RateHolder(parent)

    override fun getItemCount(): Int = rates.size

    override fun onBindViewHolder(holder: RateHolder, position: Int) {
        holder.bind(rates[position])
    }

    override fun setData(data: List<RateModel>) {
        this.rates = data
        notifyDataSetChanged()
    }

    class RateHolder(
        private val parent: ViewGroup,
        private val binding: RateItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.rate_item,
            parent,
            false
        )
    ): RecyclerView.ViewHolder(binding.root) {
        fun bind(rate: RateModel) {
           binding.rate = rate
        }
    }
}
