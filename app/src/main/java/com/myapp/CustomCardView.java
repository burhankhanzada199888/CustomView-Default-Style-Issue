package com.myapp;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;

public class CustomCardView extends MaterialCardView {

    public CustomCardView(Context context) {
        this(context, null);
    }

    public CustomCardView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomCardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CustomCardView, defStyleAttr, R.style.CustomCardView);

        float imageSize = a.getDimension(R.styleable.CustomCardView_imageSize, 0);
        float textSize = a.getDimension(R.styleable.CustomCardView_textSize, 0);

        a.recycle();

        inflate(context, R.layout.custom_view, this);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.getLayoutParams().height = (int) imageSize;
        imageView.getLayoutParams().width = (int) imageSize;

        TextView textView = findViewById(R.id.textView);
        textView.setTextSize(textSize);

    }

}
