package com.android.settings.deviceinfo.aboutphone.parameters;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

import com.android.settings.R;
import com.android.settings.deviceinfo.RamSizeInfo;

public class RamSizeTextView extends TextView{

    public RamSizeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setText(RamSizeInfo.getTotalRam(context));
    }

}
