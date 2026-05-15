package android.support.v7.widget;

import android.graphics.Rect;
import android.os.Build;
import android.support.v4.view.ai;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ad {
    private static Method a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                a = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                if (!a.isAccessible()) {
                    a.setAccessible(true);
                }
            } catch (NoSuchMethodException e) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    public static boolean a(View view) {
        return ai.e(view) == 1;
    }

    public static int a(int i, int i2) {
        return i | i2;
    }

    public static void a(View view, Rect rect, Rect rect2) {
        if (a != null) {
            try {
                a.invoke(view, rect, rect2);
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    public static void b(View view) {
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
