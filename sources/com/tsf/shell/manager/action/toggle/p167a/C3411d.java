package com.tsf.shell.manager.action.toggle.p167a;

import android.content.Intent;
import android.net.ConnectivityManager;
import com.censivn.C3DEngine.C0853a;
import com.tsf.shell.manager.action.toggle.C3414b;
import java.lang.reflect.Method;
/* renamed from: com.tsf.shell.manager.action.toggle.a.d */
/* loaded from: classes.dex */
public class C3411d extends C3414b {
    public C3411d(int i) {
        super(i);
        mo2601d();
    }

    @Override // com.tsf.shell.manager.action.toggle.C3414b
    /* renamed from: d */
    public void mo2601d() {
        mo2607a((Intent) null);
    }

    @Override // com.tsf.shell.manager.action.toggle.C3414b
    /* renamed from: c */
    public void mo2602c() {
        if (m2611h()) {
            m2612a(false);
        } else {
            m2612a(true);
        }
        mo2607a((Intent) null);
    }

    @Override // com.tsf.shell.manager.action.toggle.C3414b
    /* renamed from: a */
    public void mo2607a(Intent intent) {
        if (m2611h()) {
            m2604b(2);
        } else {
            m2604b(0);
        }
    }

    /* renamed from: h */
    private static boolean m2611h() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C0853a.m10856d().getSystemService("connectivity");
            Method method = connectivityManager.getClass().getMethod("getMobileDataEnabled", new Class[0]);
            method.setAccessible(true);
            return ((Boolean) method.invoke(connectivityManager, new Object[0])).booleanValue();
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: a */
    private static void m2612a(boolean z) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C0853a.m10856d().getSystemService("connectivity");
            connectivityManager.getClass().getMethod("setMobileDataEnabled", Boolean.TYPE).invoke(connectivityManager, Boolean.valueOf(z));
            for (int i = 0; i < 10; i++) {
                Thread.sleep(100L);
                if (m2611h() == z) {
                    return;
                }
            }
        } catch (Exception e) {
        }
    }
}
