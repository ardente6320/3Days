package com.improvement.motivation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.improvement.motivation.`object`.Goal
import com.improvement.motivation.adapter.GoalAdapter
import com.improvement.motivation.util.Cstnt
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val goals = ArrayList<Goal>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goals.add(Goal("test1","2021.03.21","2021.03.21",300.0, Cstnt.STATUS.PROGRESS))
        goals.add(Goal("test2","2021.03.21","2021.03.21",70.0, Cstnt.STATUS.PROGRESS))
        goals.add(Goal("test3","2021.03.21","2021.03.21",70.0, Cstnt.STATUS.PROGRESS))
        goals.add(Goal("test4","2021.03.21","2021.03.21",70.0, Cstnt.STATUS.PROGRESS))
        goals.add(Goal("test5","2021.03.21","2021.03.21",250.0, Cstnt.STATUS.PROGRESS))
        goals.add(Goal("test6","2021.03.21","2021.03.21",70.0, Cstnt.STATUS.PROGRESS))
        goals.add(Goal("test7","2021.03.21","2021.03.21",70.0, Cstnt.STATUS.PROGRESS))
        goals.add(Goal("test8","2021.03.21","2021.03.21",70.0, Cstnt.STATUS.PROGRESS))
        goals.add(Goal("test9","2021.03.21","2021.03.21",70.0, Cstnt.STATUS.PROGRESS))

        var goalAdapter = GoalAdapter(this)
        goalAdapter.goals = goals
        goalAdapter.notifyDataSetChanged()

        ID_GOAL_LIST_VIEW.adapter = goalAdapter

    }
}