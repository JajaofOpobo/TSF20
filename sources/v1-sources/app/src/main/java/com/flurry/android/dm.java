package com.flurry.android;

import android.content.Context;

/* loaded from: classes.dex */
final class dm extends bw {
    private /* synthetic */ Context a;
    private /* synthetic */ boolean b;
    private /* synthetic */ t c;

    dm(t tVar, Context context, boolean z) {
        this.c = tVar;
        this.a = context;
        this.b = z;
    }

    @Override // com.flurry.android.bw
    public final void a() {
        boolean z;
        z = this.c.t;
        if (!z) {
            this.c.b(this.a);
        }
        t.a(this.c, this.a, this.b);
    }
}
