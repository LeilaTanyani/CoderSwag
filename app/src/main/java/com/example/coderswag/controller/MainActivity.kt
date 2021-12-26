package com.example.coderswag.controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.R
import com.example.coderswag.adapters.CategoryAdapter
import com.example.coderswag.databinding.ActivityMainBinding
import com.example.coderswag.services.DataServices

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(
            this,
            R.layout.activity_main
        )
    }

    private val adapter by lazy { CategoryAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.lifecycleOwner = this
        binding.categoryRecycler.layoutManager = LinearLayoutManager(this)
        binding.categoryRecycler.adapter = adapter

        //we send the list to our adapter
        adapter.submitList(DataServices.categories)

    }
}