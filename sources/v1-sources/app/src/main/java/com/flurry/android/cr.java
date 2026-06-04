package com.flurry.android;

import android.content.Context;
import android.widget.VideoView;

/* loaded from: classes.dex */
final class cr extends VideoView {
    public cr(Context context) {
        super(context);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        if (i < getCurrentPosition()) {
            super.seekTo(i);
        }
    }
}
