package com.tsf.extend.base.j;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class j {
    private static DisplayMetrics a = null;
    private static int b = 480;
    private static int c = 800;
    private static int d = 480;
    private static int e = 800;
    private static boolean f = false;

    public static DisplayMetrics a() {
        Resources resources;
        if (a != null) {
            return a;
        }
        Context applicationContext = com.tsf.extend.h.b().getApplicationContext();
        if (applicationContext != null && (resources = applicationContext.getResources()) != null) {
            a = resources.getDisplayMetrics();
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    private static void c(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics a2 = a();
        if (resources != null && a2 != null) {
            if (resources.getConfiguration().orientation == 2) {
                b = a2.heightPixels;
                c = a2.widthPixels;
            } else {
                b = a2.widthPixels;
                c = a2.heightPixels;
            }
        }
        a(context, resources);
    }

    private static void a(Context context, Resources resources) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            if (Build.VERSION.SDK_INT > 16) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                a(defaultDisplay, "getRealMetrics", DisplayMetrics.class, new Object[]{displayMetrics});
                if (resources != null && resources.getConfiguration().orientation == 2) {
                    d = displayMetrics.heightPixels;
                    e = displayMetrics.widthPixels;
                } else {
                    d = displayMetrics.widthPixels;
                    e = displayMetrics.heightPixels;
                }
            } else {
                int intValue = ((Integer) a(defaultDisplay, "getRawHeight", null, null)).intValue();
                int intValue2 = ((Integer) a(defaultDisplay, "getRawWidth", null, null)).intValue();
                if (resources != null && resources.getConfiguration().orientation == 2) {
                    d = intValue;
                    e = intValue2;
                } else {
                    d = intValue2;
                    e = intValue;
                }
            }
        } catch (Exception e2) {
            try {
                Display defaultDisplay2 = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay2.getRealSize(point);
                if (resources != null && resources.getConfiguration().orientation == 2) {
                    d = point.y;
                    e = point.x;
                } else {
                    d = point.x;
                    e = point.y;
                }
            } catch (Exception e3) {
                d = b;
                e = c;
            }
        }
        d = Math.max(d, b);
        e = Math.max(e, c);
    }

    private static Object a(Object obj, String str, Class<?> cls, Object[] objArr) {
        Object obj2 = null;
        try {
            Class<?> cls2 = Class.forName("android.view.Display");
            Method declaredMethod = cls != null ? cls2.getDeclaredMethod(str, cls) : cls2.getDeclaredMethod(str, new Class[0]);
            declaredMethod.setAccessible(true);
            obj2 = declaredMethod.invoke(obj, objArr);
            return obj2;
        } catch (Exception e2) {
            return obj2;
        }
    }

    public static int a(Context context) {
        if (!f) {
            c(context.getApplicationContext());
            f = true;
        }
        return d;
    }

    public static int b(Context context) {
        if (!f) {
            c(context.getApplicationContext());
            f = true;
        }
        return e;
    }
}
