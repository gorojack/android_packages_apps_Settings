package com.android.settings.deviceinfo.aboutphone.parameters;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

import com.android.settings.R;

public class BoardTextView extends TextView{

    public BoardTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setText(Build.BOARD);
    }

}
