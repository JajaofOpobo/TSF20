package android.support.v4.view;

import android.os.Build;

/* loaded from: classes.dex */
public class q {
    static final u a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 14) {
            a = new t();
        } else if (i >= 11) {
            a = new s();
        } else {
            a = new r();
        }
    }
}
