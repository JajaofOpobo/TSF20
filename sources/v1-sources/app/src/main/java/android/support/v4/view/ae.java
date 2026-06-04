package android.support.v4.view;

import android.os.Build;
import android.view.VelocityTracker;

/* loaded from: classes.dex */
public final class ae {
    static final ah a;

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            a = new ag();
        } else {
            a = new af();
        }
    }

    public static float a(VelocityTracker velocityTracker, int i) {
        return a.a(velocityTracker, i);
    }
}
