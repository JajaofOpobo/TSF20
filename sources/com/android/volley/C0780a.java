package com.android.volley;

import android.content.Intent;
/* renamed from: com.android.volley.a */
/* loaded from: classes.dex */
public class C0780a extends C0809s {

    /* renamed from: b */
    private Intent f2249b;

    public C0780a() {
    }

    public C0780a(C0792i c0792i) {
        super(c0792i);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f2249b != null ? "User needs to (re)enter credentials." : super.getMessage();
    }
}
