package com.android.settings.deviceinfo.aboutphone.parameters;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

import com.android.settings.R;
import com.android.settings.deviceinfo.BatteryInfo;

public class BatteryTextView extends TextView{

    public BatteryTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setText(BatteryInfo.getBatteryCapacity(context));
    }

}
