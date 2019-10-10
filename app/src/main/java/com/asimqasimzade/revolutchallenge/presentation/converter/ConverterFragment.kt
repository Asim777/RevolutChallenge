package com.asimqasimzade.revolutchallenge.presentation.converter

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.asimqasimzade.revolutchallenge.R
import com.asimqasimzade.revolutchallenge.databinding.FragmentConverterBinding
import com.asimqasimzade.revolutchallenge.presentation.base.BaseFragment
import kotlinx.android.synthetic.main.default_toolbar.view.toolbar

class ConverterFragment : BaseFragment<ConverterViewModel, FragmentConverterBinding>() {

    override val bindingLayout = R.layout.fragment_converter
    override val viewModel: ConverterViewModel by lazy {
        ViewModelProviders.of(this, vmFactory).get(ConverterViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toolbarContainer.toolbar.title = getText(R.string.converter_fragment_title)

        setupInputListeners()
        setupOutputListeners()

        val ratesAdapter = RatesAdapter()
        binding.ratesRecycler.layoutManager = LinearLayoutManager(requireActivity())
        binding.ratesRecycler.adapter = ratesAdapter
        /*ratesAdapter.setData(ratesData)*/
    }

    private fun setupOutputListeners() {
        viewModel.outputs.getRates().subscribe {

        }
    }

    private fun setupInputListeners() {
        viewModel.inputs
    }


}
