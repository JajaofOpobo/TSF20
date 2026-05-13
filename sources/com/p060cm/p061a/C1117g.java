package com.p060cm.p061a;

import android.util.Log;
/* renamed from: com.cm.a.g */
/* loaded from: classes.dex */
public class C1117g {

    /* renamed from: a */
    private static Object f3567a = new Object();

    /* renamed from: b */
    private static volatile boolean f3568b = false;

    /* renamed from: a */
    public static boolean m9839a(boolean z) {
        boolean z2 = true;
        if (!f3568b) {
            synchronized (f3567a) {
                if (!f3568b) {
                    try {
                        C1119i.m9827a().m9826a("kcmutil");
                    } catch (Error e) {
                        Log.d("", "", e);
                        z2 = false;
                    } catch (Exception e2) {
                        z2 = false;
                    }
                    f3568b = z2;
                }
            }
        }
        return z2;
    }
}
