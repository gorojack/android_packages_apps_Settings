package com.android.settings.deviceinfo.aboutphone.parameters;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class DisplayTextView extends TextView {

    DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
    int widthPixels = displayMetrics.widthPixels;
    int heightPixels = displayMetrics.heightPixels;

    public DisplayTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setText(widthPixels+"x"+heightPixels);
    }
}
