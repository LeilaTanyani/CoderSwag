package com.example.coderswag.controller

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.R
import com.example.coderswag.adapters.CategoryAdapter
import com.example.coderswag.databinding.ActivityMainBinding
import com.example.coderswag.utilities.EXTRA_CATEGORY
import com.example.coderswag.viewmodel.CategoryViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(
            this,
            R.layout.activity_main
        )
    }


    //It's like doing onclick listener
    private val adapter by lazy {
        CategoryAdapter { category ->
            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }
    }

    // Lazy Inject ViewModel
    val categoryViewModel: CategoryViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.lifecycleOwner = this
        binding.categoryRecycler.layoutManager = LinearLayoutManager(this)
        binding.categoryRecycler.adapter = adapter


        /*I have defined a function in my viewModel that gets the
        the data from the DataServices class and returns it. I moved a data operation into the viewModels because
        I didn't want it to be affected by the activity lifestyle changes*/
        //we send the list to our adapter
        adapter.submitList(categoryViewModel.getCategories())


    }
}