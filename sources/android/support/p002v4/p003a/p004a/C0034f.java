package android.support.p002v4.p003a.p004a;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;
/* renamed from: android.support.v4.a.a.f */
/* loaded from: classes.dex */
class C0034f {

    /* renamed from: a */
    private static Method f91a;

    /* renamed from: b */
    private static boolean f92b;

    /* renamed from: c */
    private static Method f93c;

    /* renamed from: d */
    private static boolean f94d;

    /* renamed from: a */
    public static void m13820a(Drawable drawable, int i) {
        if (!f92b) {
            try {
                f91a = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f91a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompatJellybeanMr1", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            f92b = true;
        }
        if (f91a != null) {
            try {
                f91a.invoke(drawable, Integer.valueOf(i));
            } catch (Exception e2) {
                Log.i("DrawableCompatJellybeanMr1", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                f91a = null;
            }
        }
    }

    /* renamed from: a */
    public static int m13821a(Drawable drawable) {
        if (!f94d) {
            try {
                f93c = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f93c.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompatJellybeanMr1", "Failed to retrieve getLayoutDirection() method", e);
            }
            f94d = true;
        }
        if (f93c != null) {
            try {
                return ((Integer) f93c.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.i("DrawableCompatJellybeanMr1", "Failed to invoke getLayoutDirection() via reflection", e2);
                f93c = null;
            }
        }
        return -1;
    }
}
