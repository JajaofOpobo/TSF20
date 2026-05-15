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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a() {
        /*
            r1 = 1
            r2 = 0
            boolean r0 = d()     // Catch: java.lang.Exception -> L1b
            if (r0 == 0) goto L1e
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r3 = 21
            if (r0 < r3) goto L1e
            r0 = r1
        Lf:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 16
            if (r3 < r4) goto L17
            if (r0 == 0) goto L18
        L17:
            r1 = r2
        L18:
            com.tsf.shell.utils.g.b = r1
            return
        L1b:
            r0 = move-exception
            r0 = r2
            goto Lf
        L1e:
            r0 = r2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.utils.g.a():void");
    }

    private static boolean d() {
        return Build.PRODUCT.contains("hlte") || Build.PRODUCT.contains("klte") || Build.PRODUCT.contains("trelte") || Build.PRODUCT.contains("trlte") || Build.PRODUCT.contains("tblte") || Build.PRODUCT.contains("tbelte");
    }

    public static void a(ViewGroup viewGroup) {
    }

    public static boolean a(String str, String str2) {
        int iIntValue;
        try {
            Class<?> cls = Class.forName(str);
            Field declaredField = cls.getDeclaredField(str2);
            declaredField.setAccessible(true);
            iIntValue = Integer.valueOf(declaredField.getInt(cls)).intValue();
        } catch (Exception e2) {
            iIntValue = 0;
        }
        return iIntValue != 0;
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
            case 1:
                Window window = activity.getWindow();
                if (z) {
                    window.setFlags(67108864, 67108864);
                } else {
                    window.clearFlags(67108864);
                }
                break;
            case 2:
                View decorView = activity.getWindow().getDecorView();
                if (z) {
                    decorView.setSystemUiVisibility(4096);
                } else {
                    decorView.setSystemUiVisibility(1024);
                }
                break;
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
