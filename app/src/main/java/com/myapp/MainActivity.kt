package com.myapp

import android.content.Context
import android.os.Bundle
import android.view.ContextThemeWrapper
import android.widget.LinearLayout.LayoutParams
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        val params = LayoutParams(
            LayoutParams.MATCH_PARENT,
            0,
            1f
        )

        val margin = convertPxToDp(this, 8f)

        params.setMargins(margin, margin, margin, margin)

        val cardView = CustomCardView(this)
        cardView.layoutParams = params

        content.addView(cardView)

    }

    private fun convertPxToDp(context: Context, dp: Float): Int {
        return (dp * context.resources.displayMetrics.density).toInt()
    }

}
