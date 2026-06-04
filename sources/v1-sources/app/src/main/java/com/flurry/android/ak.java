package com.flurry.android;

import android.content.Context;
import android.os.Handler;

/* loaded from: classes.dex */
final class ak extends bw {
    final /* synthetic */ Context a;
    final /* synthetic */ t b;
    private /* synthetic */ boolean c;

    ak(t tVar, boolean z, Context context) {
        this.b = tVar;
        this.c = z;
        this.a = context;
    }

    @Override // com.flurry.android.bw
    public final void a() {
        Handler handler;
        long j;
        this.b.j();
        this.b.o();
        if (!this.c) {
            handler = this.b.m;
            ee eeVar = new ee(this);
            j = t.g;
            handler.postDelayed(eeVar, j);
        }
        if (t.e()) {
            Cdo.a("FlurryAgent", "Attempting to persist AdLogs");
            this.b.b.j();
            Cdo.a("FlurryAgent", "Attempting to persist FreqCap");
            this.b.b.k();
        }
    }
}
