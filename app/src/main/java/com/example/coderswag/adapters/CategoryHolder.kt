package com.example.coderswag.adapters

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.model.Category

class CategoryHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
    //2
    private var view: View = v
    private var category: Category? = null

    //3
    init {
        v.setOnClickListener(this)
    }

    //4
    override fun onClick(v: View) {
        Log.d("RecyclerView", "CLICK!")
    }

    companion object {
        //5
        private val PHOTO_KEY = "PHOTO"
    }
}