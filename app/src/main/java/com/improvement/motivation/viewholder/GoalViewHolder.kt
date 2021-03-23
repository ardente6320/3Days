package com.improvement.motivation.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.improvement.motivation.R
import com.improvement.motivation.`object`.Goal
import kotlinx.android.synthetic.main.goal_item_view.view.*

class GoalViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
    val goalTitle = itemView.ID_GOAL_TITLE
    val goalPeriod = itemView.ID_GOAL_PERIOD
    val rateBar = itemView.ID_ACHIEVEMENT_RATE_BAR
    fun bind(goal : Goal){
        goalTitle.text = goal.title
        goalPeriod.text = goal.startDate + "~" + goal.endDate
        rateBar.setRateBarHeight(goal.progress)
    }
}