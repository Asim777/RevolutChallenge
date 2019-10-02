package com.asimqasimzade.revolutchallenge.presentation.converter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProviders

import com.asimqasimzade.revolutchallenge.R
import com.asimqasimzade.revolutchallenge.presentation.base.BaseFragment
import kotlinx.android.synthetic.main.toolbar.*

class ConverterFragment : BaseFragment<ConverterViewModel, ViewDataBinding>() {

    override val bindingLayout = R.layout.fragment_converter
    override val viewModel: ConverterViewModel by lazy {
        ViewModelProviders.of(this, vmFactory).get(ConverterViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_converter, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar.title = getText(R.string.converter_fragment_title)
    }
}
