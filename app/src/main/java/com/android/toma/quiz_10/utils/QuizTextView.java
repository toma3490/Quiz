package com.android.toma.quiz_10.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class QuizTextView extends android.support.v7.widget.AppCompatTextView {
    public QuizTextView(Context context) {
        super(context);
        setType(context);
    }

    public QuizTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setType(context);
    }

    public QuizTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setType(context);
    }

    private void setType(Context context){
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/10425.ttf"));
    }
}
