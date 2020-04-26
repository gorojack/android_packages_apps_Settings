package com.android.settings.deviceinfo.aboutphone;

import android.content.Context;
import android.os.SystemProperties;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import com.android.settings.R;

public class AueVersionTextView extends TextView{

    private static final String KEY_AUE_VERSION_PROP = "ro.aue.version";

    public AueVersionTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setText(SystemProperties.get(KEY_AUE_VERSION_PROP,getContext().getResources().getString(R.string.unknown)));
    }

}
