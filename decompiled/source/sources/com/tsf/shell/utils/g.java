package com.tsf.shell.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class g {
    private static Method c = a(View.class, "setLayerType", Integer.TYPE, Paint.class);
    private static Method d = a(ViewGroup.class, "setMotionEventSplittingEnabled", Boolean.TYPE);
    private static boolean e = false;
    private static int f = 0;
    public static boolean a = false;
    public static boolean b = false;

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            return null;
        }
    }

    public static void a() {
        boolean z;
        boolean z2 = true;
        try {
        } catch (Exception e2) {
            z = false;
        }
        if (d()) {
            if (Build.VERSION.SDK_INT >= 21) {
                z = true;
                if (Build.VERSION.SDK_INT >= 16 || z) {
                    z2 = false;
                }
                b = z2;
            }
        }
        z = false;
        if (Build.VERSION.SDK_INT >= 16) {
        }
        z2 = false;
        b = z2;
    }

    private static boolean d() {
        return Build.PRODUCT.contains("hlte") || Build.PRODUCT.contains("klte") || Build.PRODUCT.contains("trelte") || Build.PRODUCT.contains("trlte") || Build.PRODUCT.contains("tblte") || Build.PRODUCT.contains("tbelte");
    }

    public static void a(ViewGroup viewGroup) {
    }

    public static boolean a(String str, String str2) {
        int i;
        try {
            Class<?> cls = Class.forName(str);
            Field declaredField = cls.getDeclaredField(str2);
            declaredField.setAccessible(true);
            i = Integer.valueOf(declaredField.getInt(cls)).intValue();
        } catch (Exception e2) {
            i = 0;
        }
        return i != 0;
    }

    private static int e() {
        if (!e) {
            if (Build.VERSION.SDK_INT >= 19) {
                f = 1;
                a = true;
            } else if (a("com.android.internal.statusbar.IStatusBarService$Stub", "TRANSACTION_transparentizeStatusBar")) {
                f = 2;
                a = true;
            } else {
                f = 0;
                a = false;
            }
            e = true;
        }
        return f;
    }

    @SuppressLint({"NewApi"})
    public static void a(Activity activity, boolean z) {
        switch (f) {
            case 0:
            default:
                return;
            case 1:
                Window window = activity.getWindow();
                if (z) {
                    window.setFlags(67108864, 67108864);
                    return;
                } else {
                    window.clearFlags(67108864);
                    return;
                }
            case 2:
                View decorView = activity.getWindow().getDecorView();
                if (z) {
                    decorView.setSystemUiVisibility(4096);
                    return;
                } else {
                    decorView.setSystemUiVisibility(1024);
                    return;
                }
        }
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 19;
    }

    public static boolean c() {
        e();
        return a;
    }
}
