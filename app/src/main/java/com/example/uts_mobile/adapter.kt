package com.example.uts_mobile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import kotlinx.android.synthetic.main.list.view.*
class FacAdapter (val itemFac: List<FacData>, val clickListener: (FacData) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list, parent, false)
        return PartViewHolder(view)
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(itemFac[position], clickListener)
    }
    override fun getItemCount() = itemFac.size
    class PartViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(data : FacData, clickListener: (FacData) -> Unit){
            itemView.gambar_fakultas.setImageResource(data.gambar_fakultas)
            itemView.tv_list_fakultas.text = data.nama_fakultas
            itemView.setOnClickListener { clickListener(data) }
        }
    }
}