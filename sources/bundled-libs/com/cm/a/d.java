package com.cm.a;

import android.os.Build;
import java.util.Random;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d {
    private static Random b = new Random(System.currentTimeMillis());
    private static String c = null;
    static Random a = null;

    public static double a() {
        double dNextDouble;
        synchronized (b) {
            dNextDouble = b.nextDouble();
        }
        return dNextDouble;
    }

    public static int a(int i) {
        if (a == null) {
            a = new Random(System.currentTimeMillis());
        }
        return a.nextInt(i);
    }

    public static int a(int i, int i2) {
        if (a == null) {
            a = new Random(System.currentTimeMillis());
        }
        return a.nextInt(i2 - i) + i;
    }

    public static int b() {
        return Build.VERSION.SDK_INT;
    }
}
