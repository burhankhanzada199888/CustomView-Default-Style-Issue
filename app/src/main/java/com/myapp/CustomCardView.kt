package com.myapp

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.appcompat.view.ContextThemeWrapper
import com.google.android.material.card.MaterialCardView

class CustomCardView : MaterialCardView {

    constructor(context: Context) : this(context, null)

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, R.attr.customCardViewStyle)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

//    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
//        ContextThemeWrapper(context, R.style.CustomCardView),
//        attrs,
//        defStyleAttr
//    )

    init {
        LayoutInflater.from(context).inflate(R.layout.custom_view, this, true)
    }
}