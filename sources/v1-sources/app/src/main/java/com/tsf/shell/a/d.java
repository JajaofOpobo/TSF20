package com.tsf.shell.a;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class d implements Runnable {
    final /* synthetic */ c a;
    private final /* synthetic */ ArrayList b;
    private final /* synthetic */ int c;
    private final /* synthetic */ Context d;

    d(c cVar, ArrayList arrayList, int i, Context context) {
        this.a = cVar;
        this.b = arrayList;
        this.c = i;
        this.d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar = (k) this.b.get(this.c);
        new j(this.d, String.valueOf(kVar.c) + kVar.a + ".db", String.valueOf(kVar.c) + kVar.a + ".xml").execute(new Void[0]);
    }
}
