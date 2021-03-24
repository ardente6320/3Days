package com.improvement.motivation.view

import android.content.Context
import android.graphics.BlendMode
import android.graphics.BlendModeColorFilter
import android.graphics.PorterDuff
import android.os.Build
import android.util.AttributeSet
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getColor
import com.improvement.motivation.R
import com.improvement.motivation.anim.ResizeAnimation
import kotlinx.android.synthetic.main.achievement_rate_bar.view.*

class AchievementRateBar @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private var rate: Double = 0.0
    init {
        inflate(context, R.layout.achievement_rate_bar, this)
    }

    /**
     * 비율 길이 설정
     * @param rate 비율
     */
    fun setRateBar(rate:Double){
        val lp = ID_RATE_BAR?.layoutParams
        lp?.let {

            val rateBarWidth = ID_RATE_BAR_PARENT.layoutParams.width * rate / 100

            ID_RATE_BAR.animation = ResizeAnimation(ID_RATE_BAR,
                    lp.height.toFloat(),lp.height.toFloat(),rateBarWidth.toFloat(),lp.width.toFloat(),1000)
        }

        ContextCompat.getDrawable(context,R.drawable.bg_inner_rate_bar)?.apply{
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q){
                colorFilter = BlendModeColorFilter(getRateColor(rate), BlendMode.SRC_IN)
            }else{
                setColorFilter(getRateColor(rate),PorterDuff.Mode.SRC_IN)
            }
            ID_RATE_BAR.setBackgroundDrawable(this)
        }
    }

    /**
     * 비율에 따라 색상 변경
     * @param rate 비율
     * @return color 색상 코
     */
    private fun getRateColor(rate:Double):Int{
        return when {
            rate < 30.0 -> {
                getColor(context,R.color.light_green)
            }
            rate < 65.0 -> {
                getColor(context,R.color.yellow)
            }
            rate < 80.0 -> {
                getColor(context,R.color.red)
            }
            else -> {
                getColor(context,R.color.turquoise)
            }
        }
    }
}