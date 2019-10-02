package com.asimqasimzade.revolutchallenge.presentation.base

import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.asimqasimzade.revolutchallenge.di.ViewModelProviderFactory
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

abstract class BaseFragment<T: BaseViewModel, B: ViewDataBinding> : Fragment(), BaseView<T> {

    @Inject
    protected lateinit var vmFactory: ViewModelProviderFactory<T>

    protected lateinit var binding: B
    protected val subscriptions = CompositeDisposable()

    override fun onPause() {
        subscriptions.clear()
        super.onPause()
    }

}