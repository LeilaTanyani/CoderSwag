package com.example.coderswag.controller

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.example.coderswag.R
import com.example.coderswag.adapters.CategoryAdapter
import com.example.coderswag.adapters.ProductAdapter
import com.example.coderswag.databinding.ActivityProductsBinding
import com.example.coderswag.services.DataServices
import com.example.coderswag.utilities.EXTRA_CATEGORY
import com.example.coderswag.utilities.EXTRA_PRODUCT
import com.example.coderswag.viewmodel.ProductViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class ProductsActivity : AppCompatActivity() {

    private val binding by lazy {
        DataBindingUtil.setContentView<ActivityProductsBinding>(
            this,
            R.layout.activity_products
        )
    }


    //It's like doing onclick listener
    private val adapter by lazy { ProductAdapter { product ->
        val detailsIntent = Intent(this, DetailsActivity::class.java)
        detailsIntent.putExtra(EXTRA_PRODUCT, product)
        startActivity(detailsIntent)
    } }

    // Lazy Inject ViewModel
    private val productViewModel: ProductViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.lifecycleOwner = this
        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE)
            spanCount = 3

        binding.productRecycler.layoutManager = GridLayoutManager(this, spanCount)
        binding.productRecycler.adapter = adapter
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY).toString()
        adapter.submitList(productViewModel.getProducts(categoryType))

    }
}