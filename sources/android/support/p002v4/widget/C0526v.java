package android.support.p002v4.widget;

import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* renamed from: android.support.v4.widget.v */
/* loaded from: classes.dex */
class C0526v {

    /* renamed from: a */
    private static Method f1104a;

    /* renamed from: b */
    private static boolean f1105b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12166a(PopupWindow popupWindow, int i) {
        if (!f1105b) {
            try {
                f1104a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f1104a.setAccessible(true);
            } catch (Exception e) {
            }
            f1105b = true;
        }
        if (f1104a != null) {
            try {
                f1104a.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception e2) {
            }
        }
    }
}
