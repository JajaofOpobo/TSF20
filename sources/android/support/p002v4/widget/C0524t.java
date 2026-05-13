package android.support.p002v4.widget;

import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
/* renamed from: android.support.v4.widget.t */
/* loaded from: classes.dex */
class C0524t {

    /* renamed from: a */
    private static Field f1103a;

    static {
        try {
            f1103a = PopupWindow.class.getDeclaredField("mOverlapAnchor");
            f1103a.setAccessible(true);
        } catch (NoSuchFieldException e) {
            Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12169a(PopupWindow popupWindow, boolean z) {
        if (f1103a != null) {
            try {
                f1103a.set(popupWindow, Boolean.valueOf(z));
            } catch (IllegalAccessException e) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e);
            }
        }
    }
}
