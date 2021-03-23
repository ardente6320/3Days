package com.improvement.motivation.view

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import com.improvement.motivation.R
import com.improvement.motivation.anim.ResizeAnimation
import kotlinx.android.synthetic.main.achievement_rate_bar.view.*

class AchievementRateBar @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    init {
        inflate(context, R.layout.achievement_rate_bar, this)
    }
    fun setRate(rate:Double){

        val lp = ID_RATE_BAR.layoutParams
        lp?.let {
            val rateWidth = width * (rate /100)

            System.out.println(width)
            ID_RATE_BAR.animation = ResizeAnimation(ID_RATE_BAR,
                    lp.height.toFloat(),lp.height.toFloat(),rateWidth.toFloat(),lp.width.toFloat(),1000)
        }
    }
}