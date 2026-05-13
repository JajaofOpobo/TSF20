package com.ksmobile.p063a.p065b;

import android.content.Context;
/* renamed from: com.ksmobile.a.b.b */
/* loaded from: classes.dex */
public class C1283b {
    /* renamed from: a */
    public static int m9122a(Context context) {
        if (context != null) {
            try {
                return context.getResources().getDisplayMetrics().densityDpi;
            } catch (Exception e) {
                return 240;
            }
        }
        return 240;
    }
}
