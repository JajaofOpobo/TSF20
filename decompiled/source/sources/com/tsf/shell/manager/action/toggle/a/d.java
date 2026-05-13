package com.tsf.shell.manager.action.toggle.a;

import android.content.Intent;
import android.net.ConnectivityManager;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class d extends com.tsf.shell.manager.action.toggle.b {
    public d(int i) {
        super(i);
        d();
    }

    @Override // com.tsf.shell.manager.action.toggle.b
    public void d() {
        a((Intent) null);
    }

    @Override // com.tsf.shell.manager.action.toggle.b
    public void c() {
        if (h()) {
            a(false);
        } else {
            a(true);
        }
        a((Intent) null);
    }

    @Override // com.tsf.shell.manager.action.toggle.b
    public void a(Intent intent) {
        if (h()) {
            b(2);
        } else {
            b(0);
        }
    }

    private static boolean h() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) com.censivn.C3DEngine.a.d().getSystemService("connectivity");
            Method method = connectivityManager.getClass().getMethod("getMobileDataEnabled", new Class[0]);
            method.setAccessible(true);
            return ((Boolean) method.invoke(connectivityManager, new Object[0])).booleanValue();
        } catch (Exception e) {
            return false;
        }
    }

    private static void a(boolean z) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) com.censivn.C3DEngine.a.d().getSystemService("connectivity");
            connectivityManager.getClass().getMethod("setMobileDataEnabled", Boolean.TYPE).invoke(connectivityManager, Boolean.valueOf(z));
            for (int i = 0; i < 10; i++) {
                Thread.sleep(100L);
                if (h() == z) {
                    return;
                }
            }
        } catch (Exception e) {
        }
    }
}
