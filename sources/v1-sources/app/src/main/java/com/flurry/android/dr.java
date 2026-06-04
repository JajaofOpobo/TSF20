package com.flurry.android;

import android.widget.VideoView;

/* loaded from: classes.dex */
final class dr {
    private /* synthetic */ FlurryFullscreenTakeoverActivity a;

    private dr(FlurryFullscreenTakeoverActivity flurryFullscreenTakeoverActivity) {
        this.a = flurryFullscreenTakeoverActivity;
    }

    /* synthetic */ dr(FlurryFullscreenTakeoverActivity flurryFullscreenTakeoverActivity, byte b) {
        this(flurryFullscreenTakeoverActivity);
    }

    public final boolean a(String str, boolean z) {
        boolean b;
        VideoView videoView;
        VideoView videoView2;
        b = FlurryFullscreenTakeoverActivity.b(str);
        if (!b) {
            return false;
        }
        this.a.f = new VideoView(this.a);
        videoView = this.a.f;
        videoView.setFocusable(true);
        videoView2 = this.a.f;
        videoView2.setFocusableInTouchMode(true);
        this.a.g = z;
        this.a.c(str);
        return true;
    }
}
