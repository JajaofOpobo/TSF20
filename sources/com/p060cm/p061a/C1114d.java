package com.p060cm.p061a;

import android.os.Build;
import java.util.Random;
/* renamed from: com.cm.a.d */
/* loaded from: classes.dex */
public class C1114d {

    /* renamed from: b */
    private static Random f3564b = new Random(System.currentTimeMillis());

    /* renamed from: c */
    private static String f3565c = null;

    /* renamed from: a */
    static Random f3563a = null;

    /* renamed from: a */
    public static double m9847a() {
        double nextDouble;
        synchronized (f3564b) {
            nextDouble = f3564b.nextDouble();
        }
        return nextDouble;
    }

    /* renamed from: a */
    public static int m9846a(int i) {
        if (f3563a == null) {
            f3563a = new Random(System.currentTimeMillis());
        }
        return f3563a.nextInt(i);
    }

    /* renamed from: a */
    public static int m9845a(int i, int i2) {
        if (f3563a == null) {
            f3563a = new Random(System.currentTimeMillis());
        }
        return f3563a.nextInt(i2 - i) + i;
    }

    /* renamed from: b */
    public static int m9844b() {
        return Build.VERSION.SDK_INT;
    }
}
