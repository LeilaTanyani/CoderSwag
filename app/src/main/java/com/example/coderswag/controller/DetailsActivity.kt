package com.example.coderswag.controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.coderswag.R
import com.example.coderswag.databinding.ActivityDetailsBinding
import com.example.coderswag.model.Product
import com.example.coderswag.utilities.EXTRA_PRODUCT

class DetailsActivity : AppCompatActivity() {

    private val binding by lazy {
        DataBindingUtil.setContentView<ActivityDetailsBinding>(
            this,
            R.layout.activity_details
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.lifecycleOwner = this
        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        val resourceId = binding.root.context.resources.getIdentifier(
            product?.image,
            "drawable",
            binding.root.context.packageName
        )

        binding.image.setImageResource(resourceId)
        binding.titleTxt.text = product?.title
        binding.priceTxt.text = product?.price
        binding.DescriptionTxt.text = product?.description

    }
}