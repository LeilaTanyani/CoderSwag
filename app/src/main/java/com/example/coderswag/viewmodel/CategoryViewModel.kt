package com.example.coderswag.viewmodel

import androidx.lifecycle.ViewModel
import com.example.coderswag.model.Category
import com.example.coderswag.services.DataServices

class CategoryViewModel (val category: Category): ViewModel() {

    fun getCategories()= DataServices.categories
}