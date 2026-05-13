package android.support.p013v7.widget;

import android.graphics.Rect;
import android.os.Build;
import android.support.p002v4.view.C0309ai;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: android.support.v7.widget.ad */
/* loaded from: classes.dex */
public class C0730ad {

    /* renamed from: a */
    private static Method f2098a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f2098a = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                if (!f2098a.isAccessible()) {
                    f2098a.setAccessible(true);
                }
            } catch (NoSuchMethodException e) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    /* renamed from: a */
    public static boolean m11259a(View view) {
        return C0309ai.m12904e(view) == 1;
    }

    /* renamed from: a */
    public static int m11260a(int i, int i2) {
        return i | i2;
    }

    /* renamed from: a */
    public static void m11258a(View view, Rect rect, Rect rect2) {
        if (f2098a != null) {
            try {
                f2098a.invoke(view, rect, rect2);
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    /* renamed from: b */
    public static void m11257b(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
            } catch (NoSuchMethodException e2) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (InvocationTargetException e3) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
            }
        }
    }
}
