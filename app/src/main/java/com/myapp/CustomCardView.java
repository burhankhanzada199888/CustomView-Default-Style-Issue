package com.myapp;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.widget.TextView;

import carbon.widget.FrameLayout;

public class CustomCardView extends FrameLayout {

    public CustomCardView(Context context) {
        super(new ContextThemeWrapper(context, R.style.Widget_CustomCardView), null, 0);
        initView(context, null);
    }

    public CustomCardView(Context context, AttributeSet attrs) {
        super(new ContextThemeWrapper(context, R.style.Widget_CustomCardView), attrs, 0);
        initView(context, attrs);
    }

    public CustomCardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, attrs);
    }

    private void initView(Context context, AttributeSet attrs) {

        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.CustomCardView, 0, 0);

        String text = a.getString(R.styleable.CustomCardView_text);

        a.recycle();

        LayoutInflater.from(context).inflate(R.layout.custom_view, this, true);

        TextView textView = findViewById(R.id.textView);
        textView.setText(text);

    }

}
