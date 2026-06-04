package android.support.v4.view;

import android.os.Build;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class aq {
    static final at a;

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            a = new as();
        } else {
            a = new ar();
        }
    }

    public static int a(ViewConfiguration viewConfiguration) {
        return a.a(viewConfiguration);
    }
}
