package com.android.settings.deviceinfo.aboutphone.parameters;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

import com.android.settings.R;
import com.android.settings.deviceinfo.CameraUtils;

public class CameraTextView extends TextView{

    public CameraTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setText(CameraUtils.getCameraPixels(CameraUtils.HasBackCamera()));
    }

}
