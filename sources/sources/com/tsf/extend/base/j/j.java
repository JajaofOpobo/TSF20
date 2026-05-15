package com.tsf.extend.base.j;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
        DisplayMetrics displayMetricsA = a();
        if (resources != null && displayMetricsA != null) {
            if (resources.getConfiguration().orientation == 2) {
                b = displayMetricsA.heightPixels;
                c = displayMetricsA.widthPixels;
            } else {
                b = displayMetricsA.widthPixels;
                c = displayMetricsA.heightPixels;
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
                int iIntValue = ((Integer) a(defaultDisplay, "getRawHeight", null, null)).intValue();
                int iIntValue2 = ((Integer) a(defaultDisplay, "getRawWidth", null, null)).intValue();
                if (resources != null && resources.getConfiguration().orientation == 2) {
                    d = iIntValue;
                    e = iIntValue2;
                } else {
                    d = iIntValue2;
                    e = iIntValue;
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
        Method declaredMethod;
        Object objInvoke = null;
        try {
            Class<?> cls2 = Class.forName("android.view.Display");
            if (cls != null) {
                declaredMethod = cls2.getDeclaredMethod(str, cls);
            } else {
                declaredMethod = cls2.getDeclaredMethod(str, new Class[0]);
            }
            declaredMethod.setAccessible(true);
            objInvoke = declaredMethod.invoke(obj, objArr);
            return objInvoke;
        } catch (Exception e2) {
            return objInvoke;
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
