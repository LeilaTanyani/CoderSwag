package com.example.coderswag.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.R
import com.example.coderswag.databinding.ItemCategoryBinding
import com.example.coderswag.model.Category

class CategoryAdapter :
    ListAdapter<Category, CategoryAdapter.Holder>(ItemCallBack()) {
    override fun onCreateViewHolder( //this function returns a holder
        parent: ViewGroup,
        viewType: Int
    ): Holder =
        Holder( //we return an instance of our inner Holder class
            DataBindingUtil.inflate( //we have used databinding
                LayoutInflater.from(parent.context),
                R.layout.item_category,
                parent,
                false
            )
        )


    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class Holder(val binding: ItemCategoryBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Category) {
            binding.item = item
            val resourceId = binding.root.context.resources.getIdentifier(
                item.image,
                "drawable",
                binding.root.context.packageName
            )
            binding.categoryimage.setImageResource(resourceId)
            binding.categoryname.text = item.title
        }
    }


    class ItemCallBack : DiffUtil.ItemCallback<Category>() {
        override fun areItemsTheSame(oldItem: Category, newItem: Category): Boolean =
            oldItem == newItem

        override fun areContentsTheSame(oldItem: Category, newItem: Category): Boolean =
            oldItem.title == newItem.title
    }
}

