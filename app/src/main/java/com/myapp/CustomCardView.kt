package com.myapp

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import carbon.widget.FrameLayout

class CustomCardView : FrameLayout {

    constructor(context: Context) : super(context, null, R.attr.customCardViewStyle) {
        initView(context, null)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(
        context,
        attrs,
        R.attr.customCardViewStyle
    ) {
        initView(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context, attrs, defStyleAttr
    ) {
        initView(context, attrs)
    }

    // API 21+ only
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyle: Int) : super(
        context, attrs, defStyleAttr, defStyle
    ) {
        initView(context, attrs)
    }

    private fun initView(
        context: Context,
        attrs: AttributeSet?
    ) {
        val a = context.obtainStyledAttributes(
            attrs,
            R.styleable.CustomCardView,
            R.attr.customCardViewStyle,
            R.style.Widget_CustomCardView
        )
        val text = a.getString(R.styleable.CustomCardView_text)
        a.recycle()

        LayoutInflater.from(context).inflate(R.layout.custom_view, this, true)
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = text
    }
}