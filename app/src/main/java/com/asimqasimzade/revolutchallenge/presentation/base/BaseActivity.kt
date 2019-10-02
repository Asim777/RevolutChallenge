package com.asimqasimzade.revolutchallenge.presentation.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import com.asimqasimzade.revolutchallenge.di.ViewModelProviderFactory
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

abstract class BaseActivity<T: ViewModel, B: ViewDataBinding> : AppCompatActivity(), BaseView<T> {

    @Inject
    protected lateinit var vmFactory: ViewModelProviderFactory<T>

    protected lateinit var binding: B
    protected val subscriptions = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, bindingLayout)
    }

    override fun onDestroy() {
        subscriptions.clear()
        super.onDestroy()
    }
}