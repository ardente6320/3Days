package com.improvement.motivation.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.improvement.motivation.R
import com.improvement.motivation.`object`.Goal

class GoalViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
    val goalTitle = itemView.findViewById<TextView>(R.id.ID_GOAL_TITLE)

    fun bind(goal : Goal){
        goalTitle.text = goal.title
    }
}