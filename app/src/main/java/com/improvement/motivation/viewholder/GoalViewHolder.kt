package com.improvement.motivation.viewholder

import android.os.Handler
import android.os.Looper
import android.os.Message
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.improvement.motivation.`object`.Goal
import kotlinx.android.synthetic.main.goal_item_view.view.*
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.concurrent.thread
import kotlin.concurrent.timer

class GoalViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
    val goalTitle = itemView.ID_GOAL_TITLE
    val goalPeriod = itemView.ID_GOAL_PERIOD
    val rateBar = itemView.ID_ACHIEVEMENT_RATE_BAR
    var remainDays = itemView.ID_REMAIN_DAY

    val formatter = SimpleDateFormat("yyyy.MM.dd")

    fun bind(goal : Goal){
        goalTitle.text = goal.title
        goalPeriod.text = goal.startDate + "~" + goal.endDate

        rateBar.setRateBar(goal.progress)

        remainDays.text = calDate(formatter.parse(goal.startDate).time,
                                  formatter.parse(goal.endDate).time).toString() + "일"
    }

    /**
     * 현재 날짜 차이를 계산하여 반환한다.
     * @return remainDay
     */
    private fun calDate(startDate:Long,endDate:Long) : Long{
        var remain = endDate - startDate
        remain = when(remain){
            0.toLong() -> 0
            else -> remain / (60 * 60 * 24 * 1000)
        }

        return remain
    }
}