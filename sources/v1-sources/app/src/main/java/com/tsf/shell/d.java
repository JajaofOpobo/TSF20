package com.tsf.shell;

import java.util.ArrayList;

/* loaded from: classes.dex */
final class d implements Runnable {
    final /* synthetic */ b a;
    private final /* synthetic */ ArrayList b;
    private final /* synthetic */ boolean c;

    d(b bVar, ArrayList arrayList, boolean z) {
        this.a = bVar;
        this.b = arrayList;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar;
        gVar = this.a.f;
        gVar.a(this.b, this.c);
    }
}
