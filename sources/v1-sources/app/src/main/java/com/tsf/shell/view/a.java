package com.tsf.shell.view;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
final class a implements View.OnTouchListener {
    final /* synthetic */ SettingLayout a;

    a(SettingLayout settingLayout) {
        this.a = settingLayout;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (action) {
            case 0:
                this.a.drag(x, y);
                return true;
            case 1:
                this.a.dragComplete();
                return false;
            case 2:
                this.a.drag(x, y);
                return true;
            default:
                return false;
        }
    }
}
