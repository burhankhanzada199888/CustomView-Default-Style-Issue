package com.myapp

import android.content.Context
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.widget.TextView
import carbon.widget.FrameLayout

class CustomCardView : FrameLayout {

    constructor(context: Context) : super(
        ContextThemeWrapper(context, R.style.Widget_CustomCardView), null, 0
    ) {
        initView(context, null)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(
        ContextThemeWrapper(context, R.style.Widget_CustomCardView), attrs, 0
    ) {
        initView(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context, attrs, defStyleAttr
    ) {
        initView(context, attrs)
    }

    private fun initView(
        context: Context,
        attrs: AttributeSet?
    ) {
        val a =
            context.obtainStyledAttributes(attrs, R.styleable.CustomCardView, 0, 0)
        val text = a.getString(R.styleable.CustomCardView_text)
        a.recycle()
        LayoutInflater.from(context).inflate(R.layout.custom_view, this, true)
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = text
    }
}