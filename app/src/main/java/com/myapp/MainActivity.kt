package com.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout.LayoutParams
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

        val cardView = CustomCardView(this)
        cardView.layoutParams = params

        content.addView(cardView)

    }
}
