package com.p060cm.kinfoc.p062a;

import android.util.Log;
/* renamed from: com.cm.kinfoc.a.c */
/* loaded from: classes.dex */
public class C1131c {

    /* renamed from: b */
    private static C1131c f3595b = null;

    /* renamed from: a */
    long f3596a;

    private C1131c() {
        this.f3596a = 0L;
        this.f3596a = System.currentTimeMillis() / 1000;
    }

    /* renamed from: a */
    public static C1131c m9746a() {
        if (f3595b == null) {
            f3595b = new C1131c();
        }
        return f3595b;
    }

    /* renamed from: a */
    public void m9745a(String str) {
        Log.e("InfocLog", str);
    }
}
