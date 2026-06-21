package android.support.v4.e;

import android.os.Build;

/* loaded from: classes.dex */
public class a {
    private static final b a;

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            a = new d();
        } else {
            a = new c();
        }
    }

    public static String a(String str) {
        return a.a(str);
    }

    public static String b(String str) {
        return a.b(str);
    }
}
