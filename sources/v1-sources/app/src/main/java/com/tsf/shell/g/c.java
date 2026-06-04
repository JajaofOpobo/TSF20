package com.tsf.shell.g;

import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class c {
    private static Method a = a(View.class, "setLayerType", Integer.TYPE, Paint.class);
    private static Method b = a(ViewGroup.class, "setMotionEventSplittingEnabled", Boolean.TYPE);
    private static boolean c = false;
    private static boolean d = false;

    private static Method a(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            return null;
        }
    }

    public static void a() {
    }

    private static boolean a(String str, String str2) {
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

    public static boolean b() {
        if (!c) {
            d = a("com.android.internal.statusbar.IStatusBarService$Stub", "TRANSACTION_transparentizeStatusBar");
            c = true;
        }
        return d;
    }
}
