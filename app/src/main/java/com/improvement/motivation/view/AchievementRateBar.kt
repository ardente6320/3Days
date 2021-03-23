package com.improvement.motivation.view

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import com.improvement.motivation.R
import com.improvement.motivation.anim.ResizeAnimation
import kotlinx.android.synthetic.main.achievement_rate_bar.view.*

class AchievementRateBar @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    init {
        inflate(context, R.layout.achievement_rate_bar, this)
        setRateBarHeight(1.0)
    }

    fun setRateBarHeight(value:Double){
        val lp = ID_RATE_BAR.layoutParams
        lp?.let {
            ID_RATE_BAR.animation = ResizeAnimation(ID_RATE_BAR,
                lp.height.toFloat(),lp.height.toFloat(),value.toFloat(),lp.width.toFloat(),1000)
        }
    }
}