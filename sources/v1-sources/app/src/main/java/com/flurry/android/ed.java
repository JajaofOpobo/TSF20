package com.flurry.android;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.MotionEvent;

/* loaded from: classes.dex */
final class ed extends Dialog {
    private /* synthetic */ de a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ed(de deVar, Context context) {
        super(context, R.style.Theme.Translucent.NoTitleBar.Fullscreen);
        this.a = deVar;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Activity activity;
        Activity activity2;
        activity = this.a.a.B;
        if (activity != null) {
            activity2 = this.a.a.B;
            return activity2.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        Activity activity;
        Activity activity2;
        activity = this.a.a.B;
        if (activity != null) {
            activity2 = this.a.a.B;
            return activity2.dispatchTrackballEvent(motionEvent);
        }
        return false;
    }
}
