package com.flurry.android;

import android.content.Context;

/* loaded from: classes.dex */
final class df extends bw {
    private /* synthetic */ Context a;
    private /* synthetic */ String b;

    df(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @Override // com.flurry.android.bw
    public final void a() {
        s.c(this.a, this.b);
    }
}
