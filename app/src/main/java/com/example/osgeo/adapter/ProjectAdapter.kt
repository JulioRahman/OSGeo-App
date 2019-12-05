package com.example.osgeo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.osgeo.R
import com.example.osgeo.model.Project
import kotlinx.android.synthetic.main.item_project.view.*

class ProjectAdapter(private val list: ArrayList<Project>) :
    RecyclerView.Adapter<ProjectAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_project,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.itemView.imgProject.let {
            Glide.with(holder.itemView.context).load(list[position].image).into(it)
        }
        holder.itemView.nameProject.text = list[position].name
        holder.itemView.descProject.text = list[position].desc
    }

    class Holder(view: View) : RecyclerView.ViewHolder(view)

}