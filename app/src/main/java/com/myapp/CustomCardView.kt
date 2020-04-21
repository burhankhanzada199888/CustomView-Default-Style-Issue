package com.myapp

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import carbon.widget.FrameLayout

class CustomCardView : FrameLayout {

    // API 21+ only
    constructor(context: Context) : super(
        context,
        null,
        R.attr.customCardViewStyle,
        R.style.Widget_CustomCardView
    ) {
        initView(context, null,R.attr.customCardViewStyle,R.style.Widget_CustomCardView)
    }

    // API 21+ only
    constructor(context: Context, attrs: AttributeSet?) : super(
        context,
        attrs,
        R.attr.customCardViewStyle,
        R.style.Widget_CustomCardView
    ) {
        initView(context, attrs,R.attr.customCardViewStyle,R.style.Widget_CustomCardView)
    }

    // API 21+ only
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr,
        R.style.Widget_CustomCardView
    ) {
        initView(context, attrs,defStyleAttr,R.style.Widget_CustomCardView)
    }

    // API 21+ only
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(
        context, attrs, defStyleAttr, defStyleRes
    ) {
        initView(context, attrs, defStyleAttr, defStyleRes)
    }

    private fun initView(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int
    ) {
        val a = context.obtainStyledAttributes(
            attrs,
            R.styleable.CustomCardView,
            defStyleAttr,
            defStyleRes
        )
        val text = a.getString(R.styleable.CustomCardView_text)
        a.recycle()

        LayoutInflater.from(context).inflate(R.layout.custom_view, this, true)
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = text
    }
}