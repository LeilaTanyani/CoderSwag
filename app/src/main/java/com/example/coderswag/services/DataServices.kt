package com.example.coderswag.services

import com.example.coderswag.model.Category
import com.example.coderswag.model.Product

object DataServices {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1", "All righty ladies and gentlemen. This is a pretty big exercise. What I want you to do is implement a detail view for the product that is clicked on once you select a category.\n" +
                "So the flow is, select a category, select a product, and then transition to a new activity called ProductDetailActivity where you will display more information on that product. The end result could look something like this:"),
        Product("Devslopes Hat Black", "$20", "hat2", "All righty ladies and gentlemen. This is a pretty big exercise. What I want you to do is implement a detail view for the product that is clicked on once you select a category.\n" +
                "So the flow is, select a category, select a product, and then transition to a new activity called ProductDetailActivity where you will display more information on that product. The end result could look something like this:"),
        Product("Devslopes Hat White", "$18", "hat3", "All righty ladies and gentlemen. This is a pretty big exercise. What I want you to do is implement a detail view for the product that is clicked on once you select a category.\n" +
                "So the flow is, select a category, select a product, and then transition to a new activity called ProductDetailActivity where you will display more information on that product. The end result could look something like this:"),
        Product("Devslopes Hat Snapback", "$22", "hat4", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Graphic Beanie", "$18", "hat1", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Hat Black", "$20", "hat2", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Hat White", "$18", "hat3", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Hat Snapback", "$22", "hat4", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Graphic Beanie", "$18", "hat1", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Hat Black", "$20", "hat2", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Hat White", "$18", "hat3", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Hat Snapback", "$22", "hat4", "hoodies description hoodies description hoodies description"),
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28", "hoodie1", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Hoodie Red", "$32", "hoodie2", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Hoodie White", "$42", "hoodie3", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Hoodie Snapback", "$40", "hoodie4", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Hoodie Gray", "$28", "hoodie1", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Hoodie Red", "$32", "hoodie2", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Hoodie White", "$42", "hoodie3", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Hoodie Snapback", "$40", "hoodie4", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Hoodie Gray", "$28", "hoodie1", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Hoodie Red", "$32", "hoodie2", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Hoodie White", "$42", "hoodie3", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Hoodie Snapback", "$40", "hoodie4", "hoodies description hoodies description hoodies description")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$18", "shirt1", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Badge Light Gray", "$12", "shirt2", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Logo Shirt Red", "$22", "shirt3", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Hustle", "$20", "shirt4", "hoodies description hoodies description hoodies description"),
        Product("Kickflip Studios", "$18", "shirt5", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Shirt Black", "$18", "shirt1", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Badge Light Gray", "$12", "shirt2", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Logo Shirt Red", "$22", "shirt3", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Hustle", "$20", "shirt4", "hoodies description hoodies description hoodies description"),
        Product("Kickflip Studios", "$18", "shirt5", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Shirt Black", "$18", "shirt1", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Badge Light Gray", "$12", "shirt2", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Logo Shirt Red", "$22", "shirt3", "hoodies description hoodies description hoodies description"),
        Product("Devslopes Hustle", "$20", "shirt4", "hoodies description hoodies description hoodies description"),
        Product("Kickflip Studios", "$18", "shirt5", "hoodies description hoodies description hoodies description")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String): List<Product> {
        return when (category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood

        }
    }
}
