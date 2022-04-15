package com.ivan.utsrecyleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KucingAdapter(private val context: Context, private val kucing:List<Kucing>, val listener: (Kucing) -> Unit)
    : RecyclerView.Adapter<KucingAdapter.KucingViewHolder>(){

    class KucingViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgKucing = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameKucing = view.findViewById<TextView>(R.id.tv_item_name)
        val descKucing = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(kucing: Kucing, listener: (Kucing) -> Unit){
            imgKucing.setImageResource(kucing.imgKucing)
            nameKucing.text = kucing.nameKucing
            descKucing.text = kucing.descKucing
            itemView.setOnClickListener {
                listener(kucing)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KucingViewHolder {
        return KucingViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_kucing, parent, false)
        )
    }

    override fun onBindViewHolder(holder: KucingViewHolder, position: Int) {
        holder.bindView(kucing[position], listener)
    }

    override fun getItemCount(): Int = kucing.size
}