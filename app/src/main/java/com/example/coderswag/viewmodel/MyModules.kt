package com.example.coderswag.viewmodel

import com.example.coderswag.model.Category
import com.example.coderswag.model.Product
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.scope.get
import org.koin.dsl.module

class MyModules {


}

val appModule = module {

    // single instance of HelloRepository
    single<Category> { Category("","") }
    single<Product> { Product("","", "","") }

    // MyViewModel ViewModel
    viewModel { CategoryViewModel(get()) }
    viewModel { ProductViewModel() }
}