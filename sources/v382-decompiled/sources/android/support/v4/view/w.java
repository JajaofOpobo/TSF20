package android.support.v4.view;

import android.os.Build;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public class w {
    static final ab a;

    static {
        if (Build.VERSION.SDK_INT >= 12) {
            a = new aa();
            return;
        }
        if (Build.VERSION.SDK_INT >= 9) {
            a = new z();
        } else if (Build.VERSION.SDK_INT >= 5) {
            a = new y();
        } else {
            a = new x();
        }
    }

    public static int a(MotionEvent motionEvent) {
        return motionEvent.getAction() & 255;
    }

    public static int b(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 65280) >> 8;
    }

    public static int a(MotionEvent motionEvent, int i) {
        return a.a(motionEvent, i);
    }

    public static int b(MotionEvent motionEvent, int i) {
        return a.b(motionEvent, i);
    }

    public static float c(MotionEvent motionEvent, int i) {
        return a.c(motionEvent, i);
    }

    public static float d(MotionEvent motionEvent, int i) {
        return a.d(motionEvent, i);
    }
}
