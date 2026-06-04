package com.tsf.shell.a;

import android.content.Context;

/* loaded from: classes.dex */
final class g implements Runnable {
    final /* synthetic */ f a;
    private final /* synthetic */ Context b;
    private final /* synthetic */ k c;

    g(f fVar, Context context, k kVar) {
        this.a = fVar;
        this.b = context;
        this.c = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new j(this.b, String.valueOf(this.c.c) + this.c.a + ".db", String.valueOf(this.c.c) + this.c.a + ".xml").execute(new Void[0]);
    }
}
