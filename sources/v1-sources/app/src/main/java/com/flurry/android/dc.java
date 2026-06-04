package com.flurry.android;

import android.content.Context;

/* loaded from: classes.dex */
final class dc extends bw {
    private /* synthetic */ Context a;
    private /* synthetic */ String b;
    private /* synthetic */ an c;
    private /* synthetic */ s d;

    dc(s sVar, Context context, String str, an anVar) {
        this.d = sVar;
        this.a = context;
        this.b = str;
        this.c = anVar;
    }

    @Override // com.flurry.android.bw
    public final void a() {
        this.d.a(this.a, this.b, this.c.a());
    }
}
