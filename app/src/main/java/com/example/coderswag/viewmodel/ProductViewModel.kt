package com.example.coderswag.viewmodel

import androidx.lifecycle.ViewModel
import com.example.coderswag.services.DataServices

class ProductViewModel(): ViewModel() {
    fun getProducts(categoryType: String) = DataServices.getProducts(categoryType)
}