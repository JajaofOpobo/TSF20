package android.support.v4.view;

import android.os.Build;
import android.view.VelocityTracker;

/* loaded from: classes.dex */
public class af {
    static final ai a;

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            a = new ah();
        } else {
            a = new ag();
        }
    }

    public static float a(VelocityTracker velocityTracker, int i) {
        return a.a(velocityTracker, i);
    }
}
