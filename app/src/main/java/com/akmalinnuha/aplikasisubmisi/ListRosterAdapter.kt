package com.akmalinnuha.aplikasisubmisi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListRosterAdapter(private val listRoster: ArrayList<Roster>) : RecyclerView.Adapter<ListRosterAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.mvs_item_roster, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val roster = listRoster[position]
        Glide.with(holder.itemView.context)
            .load(roster.image)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = roster.name
        holder.tvDetail.text = roster.description

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listRoster[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listRoster.size
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Roster)
    }

}