package com.tsf.shell.activity.b;

import android.content.Intent;
import android.content.pm.PackageManager;
import com.tsf.shell.Home;
import com.tsf.shell.manager.b.g;
import com.tsf.shell.manager.p.c;
import com.tsf.shell.plugin.summary.ShellSummaryActivity;

/* loaded from: classes.dex */
public class a {
    private static int a = 100;
    private static int b = 1;

    public static void a() {
        if (!b()) {
            a(b == 1);
            b = a;
            g.i(a);
        }
    }

    public static boolean b() {
        try {
            a = com.censivn.C3DEngine.a.d().getPackageManager().getPackageInfo(com.censivn.C3DEngine.a.d().getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        b = g.K();
        return b >= a;
    }

    private static void a(final boolean z) {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.activity.b.a.1
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    Intent intent = new Intent();
                    intent.setClass(com.censivn.C3DEngine.a.d(), ShellSummaryActivity.class);
                    Home.b().a(intent, (Object) null);
                    com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.activity.b.a.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            c.b.a();
                        }
                    });
                    return;
                }
                com.tsf.shell.manager.a.d.a(1800);
            }
        });
    }
}
