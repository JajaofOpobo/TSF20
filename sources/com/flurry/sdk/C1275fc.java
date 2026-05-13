package com.flurry.sdk;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Method;
/* renamed from: com.flurry.sdk.fc */
/* loaded from: classes.dex */
public class C1275fc {
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static Point m9173a() {
        Display defaultDisplay = ((WindowManager) C1211do.m9390a().m9386b().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else if (Build.VERSION.SDK_INT >= 14) {
            try {
                Method method = Display.class.getMethod("getRawHeight", new Class[0]);
                point.x = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                point.y = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Throwable th) {
                defaultDisplay.getSize(point);
            }
        } else if (Build.VERSION.SDK_INT >= 13) {
            defaultDisplay.getSize(point);
        } else {
            point.x = defaultDisplay.getWidth();
            point.y = defaultDisplay.getHeight();
        }
        return point;
    }

    /* renamed from: b */
    public static DisplayMetrics m9171b() {
        Display defaultDisplay = ((WindowManager) C1211do.m9390a().m9386b().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public static DisplayMetrics m9169c() {
        Display defaultDisplay = ((WindowManager) C1211do.m9390a().m9386b().getSystemService("window")).getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 17) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            return displayMetrics;
        } else if (Build.VERSION.SDK_INT >= 14) {
            try {
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                Display.class.getMethod("getRealMetrics", new Class[0]).invoke(defaultDisplay, displayMetrics2);
                return displayMetrics2;
            } catch (Exception e) {
                return m9171b();
            }
        } else {
            return m9171b();
        }
    }

    /* renamed from: d */
    public static float m9167d() {
        return m9169c().density;
    }

    /* renamed from: a */
    public static int m9172a(int i) {
        return Math.round(i / m9169c().density);
    }

    /* renamed from: b */
    public static int m9170b(int i) {
        return Math.round(m9169c().density * i);
    }

    /* renamed from: e */
    public static int m9166e() {
        return m9173a().x;
    }

    /* renamed from: f */
    public static int m9165f() {
        return m9173a().y;
    }

    /* renamed from: g */
    public static int m9164g() {
        return m9172a(m9166e());
    }

    /* renamed from: h */
    public static int m9163h() {
        return m9172a(m9165f());
    }

    /* renamed from: i */
    public static int m9162i() {
        Point m9173a = m9173a();
        if (m9173a.x == m9173a.y) {
            return 3;
        }
        if (m9173a.x < m9173a.y) {
            return 1;
        }
        return 2;
    }

    /* renamed from: j */
    public static Pair<Integer, Integer> m9161j() {
        return Pair.create(Integer.valueOf(m9164g()), Integer.valueOf(m9163h()));
    }

    /* renamed from: c */
    public static Pair<Integer, Integer> m9168c(int i) {
        int m9164g = m9164g();
        int m9163h = m9163h();
        switch (i) {
            case 2:
                return Pair.create(Integer.valueOf(m9163h), Integer.valueOf(m9164g));
            default:
                return Pair.create(Integer.valueOf(m9164g), Integer.valueOf(m9163h));
        }
    }
}
