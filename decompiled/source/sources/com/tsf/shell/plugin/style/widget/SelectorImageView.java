package com.tsf.shell.plugin.style.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class SelectorImageView extends ImageView implements View.OnTouchListener {
    public SelectorImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public SelectorImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        setOnTouchListener(this);
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"NewApi"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            setAlpha(0.5f);
            return false;
        } else if (action == 1) {
            setAlpha(1.0f);
            return false;
        } else {
            return false;
        }
    }
}
