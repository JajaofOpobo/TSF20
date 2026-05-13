package com.tsf.extend.base.p080j;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tsf.extend.C1547h;
import java.lang.reflect.Method;
/* renamed from: com.tsf.extend.base.j.j */
/* loaded from: classes.dex */
public class C1431j {

    /* renamed from: a */
    private static DisplayMetrics f4420a = null;

    /* renamed from: b */
    private static int f4421b = 480;

    /* renamed from: c */
    private static int f4422c = 800;

    /* renamed from: d */
    private static int f4423d = 480;

    /* renamed from: e */
    private static int f4424e = 800;

    /* renamed from: f */
    private static boolean f4425f = false;

    /* renamed from: a */
    public static DisplayMetrics m8653a() {
        Resources resources;
        if (f4420a != null) {
            return f4420a;
        }
        Context applicationContext = C1547h.m8290b().getApplicationContext();
        if (applicationContext != null && (resources = applicationContext.getResources()) != null) {
            f4420a = resources.getDisplayMetrics();
            if (f4420a != null) {
                return f4420a;
            }
        }
        return null;
    }

    /* renamed from: c */
    private static void m8648c(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics m8653a = m8653a();
        if (resources != null && m8653a != null) {
            if (resources.getConfiguration().orientation == 2) {
                f4421b = m8653a.heightPixels;
                f4422c = m8653a.widthPixels;
            } else {
                f4421b = m8653a.widthPixels;
                f4422c = m8653a.heightPixels;
            }
        }
        m8651a(context, resources);
    }

    /* renamed from: a */
    private static void m8651a(Context context, Resources resources) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            if (Build.VERSION.SDK_INT > 16) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                m8650a(defaultDisplay, "getRealMetrics", DisplayMetrics.class, new Object[]{displayMetrics});
                if (resources != null && resources.getConfiguration().orientation == 2) {
                    f4423d = displayMetrics.heightPixels;
                    f4424e = displayMetrics.widthPixels;
                } else {
                    f4423d = displayMetrics.widthPixels;
                    f4424e = displayMetrics.heightPixels;
                }
            } else {
                int intValue = ((Integer) m8650a(defaultDisplay, "getRawHeight", null, null)).intValue();
                int intValue2 = ((Integer) m8650a(defaultDisplay, "getRawWidth", null, null)).intValue();
                if (resources != null && resources.getConfiguration().orientation == 2) {
                    f4423d = intValue;
                    f4424e = intValue2;
                } else {
                    f4423d = intValue2;
                    f4424e = intValue;
                }
            }
        } catch (Exception e) {
            try {
                Display defaultDisplay2 = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay2.getRealSize(point);
                if (resources != null && resources.getConfiguration().orientation == 2) {
                    f4423d = point.y;
                    f4424e = point.x;
                } else {
                    f4423d = point.x;
                    f4424e = point.y;
                }
            } catch (Exception e2) {
                f4423d = f4421b;
                f4424e = f4422c;
            }
        }
        f4423d = Math.max(f4423d, f4421b);
        f4424e = Math.max(f4424e, f4422c);
    }

    /* renamed from: a */
    private static Object m8650a(Object obj, String str, Class<?> cls, Object[] objArr) {
        Object obj2 = null;
        try {
            Class<?> cls2 = Class.forName("android.view.Display");
            Method declaredMethod = cls != null ? cls2.getDeclaredMethod(str, cls) : cls2.getDeclaredMethod(str, new Class[0]);
            declaredMethod.setAccessible(true);
            obj2 = declaredMethod.invoke(obj, objArr);
            return obj2;
        } catch (Exception e) {
            return obj2;
        }
    }

    /* renamed from: a */
    public static int m8652a(Context context) {
        if (!f4425f) {
            m8648c(context.getApplicationContext());
            f4425f = true;
        }
        return f4423d;
    }

    /* renamed from: b */
    public static int m8649b(Context context) {
        if (!f4425f) {
            m8648c(context.getApplicationContext());
            f4425f = true;
        }
        return f4424e;
    }
}
