package com.flurry.android;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
final class bt {
    final /* synthetic */ FlurryFullscreenTakeoverActivity a;
    private View b;
    private int c;
    private m d;
    private FrameLayout e;

    private bt(FlurryFullscreenTakeoverActivity flurryFullscreenTakeoverActivity) {
        this.a = flurryFullscreenTakeoverActivity;
    }

    /* synthetic */ bt(FlurryFullscreenTakeoverActivity flurryFullscreenTakeoverActivity, byte b) {
        this(flurryFullscreenTakeoverActivity);
    }

    public final void a(View view, int i, m mVar) {
        if (this.b != null) {
            a();
        }
        this.b = view;
        this.c = this.a.getRequestedOrientation();
        this.d = mVar;
        this.e = new FrameLayout(this.a);
        this.e.setBackgroundColor(-16777216);
        this.e.addView(this.b, new FrameLayout.LayoutParams(-1, -1, 17));
        ((ViewGroup) this.a.getWindow().getDecorView()).addView(this.e, -1, -1);
        this.a.setRequestedOrientation(i);
    }

    public final void a() {
        if (this.b != null) {
            ((ViewGroup) this.a.getWindow().getDecorView()).removeView(this.e);
            this.e.removeView(this.b);
            if (this.d != null) {
                this.d.a();
            }
            this.a.setRequestedOrientation(this.c);
            this.d = null;
            this.e = null;
            this.b = null;
        }
    }
}
