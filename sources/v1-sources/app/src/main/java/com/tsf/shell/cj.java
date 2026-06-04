package com.tsf.shell;

import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public final class cj {
    private static int a = 100;
    private static int b = 1;

    public static void a() {
        if (!b()) {
            ck ckVar = new ck();
            com.censivn.C3DEngine.a.a();
            com.censivn.C3DEngine.b.w.a(ckVar);
            b = a;
            com.tsf.shell.a.t.g(a);
        }
    }

    private static boolean b() {
        try {
            a = com.censivn.C3DEngine.a.c().getPackageManager().getPackageInfo(com.censivn.C3DEngine.a.c().getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        int u = com.tsf.shell.a.t.u();
        b = u;
        return u >= a;
    }
}
