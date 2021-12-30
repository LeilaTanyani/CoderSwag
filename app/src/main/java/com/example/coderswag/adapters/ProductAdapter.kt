package com.example.coderswag.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.R
import com.example.coderswag.adapters.ProductAdapter.Holder
import com.example.coderswag.databinding.ItemProductsBinding
import com.example.coderswag.model.Product

class ProductAdapter(val itemClick: (Product) -> Unit) :
    ListAdapter<Product, Holder>(ItemCallBack()) {

    override fun onCreateViewHolder( //this function returns a holder
        parent: ViewGroup,
        viewType: Int
    ): ProductAdapter.Holder =
        Holder( //we return an instance of our inner Holder class
            DataBindingUtil.inflate( //we have used databinding
                LayoutInflater.from(parent.context),
                R.layout.item_products,
                parent,
                false
            )
        )


    override fun onBindViewHolder(holder: ProductAdapter.Holder, position: Int) {
        holder.bind(getItem(position))
    }


    inner class Holder(val binding: ItemProductsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Product) {
            binding.item = item
            val resourceId = binding.root.context.resources.getIdentifier(
                item.image,
                "drawable",
                binding.root.context.packageName
            )
            binding.productImage.setImageResource(resourceId)
            binding.title.text = item.title
            binding.price.text = item.price
            binding.itemProductContainer.setOnClickListener { itemClick(item) }
        }
    }

    //if we have any changes in our data, this method is called and not all the items are updated
    //just the ones that have changed..
    class ItemCallBack : DiffUtil.ItemCallback<Product>() {
        override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean =
            oldItem == newItem

        override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean =
            oldItem.title == newItem.title
    }
}