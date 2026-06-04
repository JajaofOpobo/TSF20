package com.tsf.shell.preference.video;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.util.List;

/* loaded from: classes.dex */
final class b implements View.OnTouchListener {
    c a;
    final /* synthetic */ a b;
    private final /* synthetic */ ImageView c;

    b(a aVar, int i, ImageView imageView) {
        VideoViwerActivity videoViwerActivity;
        List list;
        this.b = aVar;
        this.c = imageView;
        videoViwerActivity = aVar.a;
        list = videoViwerActivity.d;
        this.a = (c) list.get(i);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        VideoViwerActivity videoViwerActivity;
        switch (motionEvent.getAction()) {
            case 0:
                this.c.getDrawable().setAlpha(128);
                break;
            case 1:
                this.c.getDrawable().setAlpha(255);
                videoViwerActivity = this.b.a;
                VideoOptionDialogActivity.a(videoViwerActivity, this.a.e, this.a.d);
                break;
            case 3:
                this.c.getDrawable().setAlpha(255);
                break;
        }
        return true;
    }
}
