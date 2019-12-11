package com.tioago.marvelappteste.adapter

import android.content.Context
import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import com.tioago.marvelappteste.R
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.tioago.marvelappteste.model.Items
import kotlinx.android.synthetic.main.item_character.view.*

class ItemsAdapter(val listResults: ArrayList<Items>?, val context: Context): Adapter<ItemsAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val result = listResults!!.get(position)
        holder.let {
            it.bindView(result, context)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_character, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listResults!!.size
    }



    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(result: Items, context: Context) {

            val title = itemView.title
            val img = itemView.img

            title.text = result.name
            Glide.with(context).load(result.url).into(img)

        }
    }
}