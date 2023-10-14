package com.shelazh.mvvmapp.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.shelazh.mvvmapp.R
import com.shelazh.mvvmapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.tvCounter.text = viewModel.counter.get().toString()

        binding.btnIncreaseCounter.setOnClickListener {
            viewModel.increaseCounter()
            binding.tvCounter.text = viewModel.counter.get().toString()
        }
        binding.btnDecreaseCounter.setOnClickListener {
            viewModel.decreaseCounter()
            binding.tvCounter.text = viewModel.counter.get().toString()
        }

    }
}