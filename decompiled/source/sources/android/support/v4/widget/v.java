package android.support.v4.widget;

import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
class v {
    private static Method a;
    private static boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(PopupWindow popupWindow, int i) {
        if (!b) {
            try {
                a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                a.setAccessible(true);
            } catch (Exception e) {
            }
            b = true;
        }
        if (a != null) {
            try {
                a.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception e2) {
            }
        }
    }
}
