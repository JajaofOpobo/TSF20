package android.support.v4.g;

import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public class f {
    static final i a;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            a = new h();
        } else {
            a = new g();
        }
    }

    public static void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        a.a(popupWindow, view, i, i2, i3);
    }
}
