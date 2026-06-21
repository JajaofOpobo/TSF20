package android.support.v4.view;

import android.os.Build;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public class bc {
    static final bh a;

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            a = new bg();
            return;
        }
        if (Build.VERSION.SDK_INT >= 11) {
            a = new bf();
        } else if (Build.VERSION.SDK_INT >= 8) {
            a = new be();
        } else {
            a = new bd();
        }
    }

    public static int a(ViewConfiguration viewConfiguration) {
        return a.a(viewConfiguration);
    }
}
