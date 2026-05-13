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
/* renamed from: com.tsf.shell.utils.g */
/* loaded from: classes.dex */
public class C4170g {

    /* renamed from: c */
    private static Method f13486c = m686a(View.class, "setLayerType", Integer.TYPE, Paint.class);

    /* renamed from: d */
    private static Method f13487d = m686a(ViewGroup.class, "setMotionEventSplittingEnabled", Boolean.TYPE);

    /* renamed from: e */
    private static boolean f13488e = false;

    /* renamed from: f */
    private static int f13489f = 0;

    /* renamed from: a */
    public static boolean f13484a = false;

    /* renamed from: b */
    public static boolean f13485b = false;

    /* renamed from: a */
    private static Method m686a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m689a() {
        boolean z;
        boolean z2 = true;
        try {
        } catch (Exception e) {
            z = false;
        }
        if (m682d()) {
            if (Build.VERSION.SDK_INT >= 21) {
                z = true;
                if (Build.VERSION.SDK_INT >= 16 || z) {
                    z2 = false;
                }
                f13485b = z2;
            }
        }
        z = false;
        if (Build.VERSION.SDK_INT >= 16) {
        }
        z2 = false;
        f13485b = z2;
    }

    /* renamed from: d */
    private static boolean m682d() {
        return Build.PRODUCT.contains("hlte") || Build.PRODUCT.contains("klte") || Build.PRODUCT.contains("trelte") || Build.PRODUCT.contains("trlte") || Build.PRODUCT.contains("tblte") || Build.PRODUCT.contains("tbelte");
    }

    /* renamed from: a */
    public static void m687a(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public static boolean m685a(String str, String str2) {
        int i;
        try {
            Class<?> cls = Class.forName(str);
            Field declaredField = cls.getDeclaredField(str2);
            declaredField.setAccessible(true);
            i = Integer.valueOf(declaredField.getInt(cls)).intValue();
        } catch (Exception e) {
            i = 0;
        }
        return i != 0;
    }

    /* renamed from: e */
    private static int m681e() {
        if (!f13488e) {
            if (Build.VERSION.SDK_INT >= 19) {
                f13489f = 1;
                f13484a = true;
            } else if (m685a("com.android.internal.statusbar.IStatusBarService$Stub", "TRANSACTION_transparentizeStatusBar")) {
                f13489f = 2;
                f13484a = true;
            } else {
                f13489f = 0;
                f13484a = false;
            }
            f13488e = true;
        }
        return f13489f;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m688a(Activity activity, boolean z) {
        switch (f13489f) {
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

    /* renamed from: b */
    public static boolean m684b() {
        return Build.VERSION.SDK_INT >= 19;
    }

    /* renamed from: c */
    public static boolean m683c() {
        m681e();
        return f13484a;
    }
}
