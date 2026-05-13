package android.support.p002v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;
/* renamed from: android.support.v4.widget.e */
/* loaded from: classes.dex */
class C0490e {

    /* renamed from: a */
    private static Field f1041a;

    /* renamed from: b */
    private static boolean f1042b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12273a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (compoundButton instanceof InterfaceC0477ab) {
            ((InterfaceC0477ab) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12272a(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (compoundButton instanceof InterfaceC0477ab) {
            ((InterfaceC0477ab) compoundButton).setSupportButtonTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Drawable m12274a(CompoundButton compoundButton) {
        if (!f1042b) {
            try {
                f1041a = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f1041a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompatDonut", "Failed to retrieve mButtonDrawable field", e);
            }
            f1042b = true;
        }
        if (f1041a != null) {
            try {
                return (Drawable) f1041a.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompatDonut", "Failed to get button drawable via reflection", e2);
                f1041a = null;
            }
        }
        return null;
    }
}
