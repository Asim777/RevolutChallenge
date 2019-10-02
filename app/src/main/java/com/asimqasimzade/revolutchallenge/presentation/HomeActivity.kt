package com.asimqasimzade.revolutchallenge.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.ViewModelProviders
import com.asimqasimzade.revolutchallenge.R
import com.asimqasimzade.revolutchallenge.databinding.ActivityHomeBinding
import com.asimqasimzade.revolutchallenge.presentation.base.BaseActivity

class HomeActivity : BaseActivity<HomeViewModel, ActivityHomeBinding>() {

    override val bindingLayout = R.layout.activity_home
    override val viewModel: HomeViewModel by lazy {
        ViewModelProviders.of(this, vmFactory).get(HomeViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }
}