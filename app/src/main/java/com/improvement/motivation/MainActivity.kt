package com.improvement.motivation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.improvement.motivation.`object`.Goal
import com.improvement.motivation.adapter.GoalAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val goals = ArrayList<Goal>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goals.add(Goal("test1"))
        goals.add(Goal("test2"))
        goals.add(Goal("test3"))

        var goalAdapter = GoalAdapter(this)
        goalAdapter.goals = goals
        goalAdapter.notifyDataSetChanged()

        ID_GOAL_LIST_VIEW.adapter = goalAdapter
        ID_GOAL_LIST_VIEW.addItemDecoration(DividerItemDecoration(this,LinearLayoutManager.VERTICAL))
    }
}