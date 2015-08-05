package com.github.hathibelagal.mylittlelibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class MyView extends LinearLayout {

    public MyView(Context context) {
        super(context);
        initialize(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize(context);
    }

    private void initialize(Context context){
        inflate(context, R.layout.my_view, this);
    }
}
