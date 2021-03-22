package com.improvement.motivation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.improvement.motivation.R
import com.improvement.motivation.`object`.Goal
import com.improvement.motivation.viewholder.GoalViewHolder

class GoalAdapter(private val mContext : Context): RecyclerView.Adapter<GoalViewHolder>() {

    var goals = ArrayList<Goal>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GoalViewHolder {
        var view = LayoutInflater.from(mContext).inflate(R.layout.goal_item_view,parent,false);
        return GoalViewHolder(view)
    }

    override fun getItemCount(): Int = goals.size

    override fun onBindViewHolder(holder: GoalViewHolder, position: Int) {
        holder.bind(goals.get(position))
    }
}