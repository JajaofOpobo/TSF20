package com.android.volley;

import android.content.Intent;
/* loaded from: classes.dex */
public class a extends s {
    private Intent b;

    public a() {
    }

    public a(i iVar) {
        super(iVar);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.b != null ? "User needs to (re)enter credentials." : super.getMessage();
    }
}
