package com.myapp;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import carbon.widget.FrameLayout;

public class CustomCardView extends FrameLayout {

    public CustomCardView(Context context) {
//        super(context);
//        super(context, null, R.attr.customCardViewStyle);
//        initView(context, null, 0);
        this(context, null, R.attr.customCardViewStyle);
    }

    public CustomCardView(Context context, AttributeSet attrs) {
//        super(context, attrs);
//        super(context, attrs, R.attr.customCardViewStyle);
//        initView(context, attrs, 0);
        this(context, attrs, R.attr.customCardViewStyle);
    }

    public CustomCardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, attrs, defStyleAttr);
    }

    private void initView(Context context, AttributeSet attrs, int defStyleAttr) {

        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.CustomCardView, defStyleAttr, 0);

        float imageSize = a.getDimension(R.styleable.CustomCardView_imageSize, convertPxToDp(context, 100f));
        float textSize = a.getDimension(R.styleable.CustomCardView_textSize, 25);

        a.recycle();

        inflate(getContext(), R.layout.custom_view, this);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.getLayoutParams().height = (int) imageSize;
        imageView.getLayoutParams().width = (int) imageSize;

        TextView textView = findViewById(R.id.textView);
        textView.setTextSize(textSize);

    }

    private int convertPxToDp(Context context, Float dp) {
        return (int) (dp * context.getResources().getDisplayMetrics().density);
    }

}
