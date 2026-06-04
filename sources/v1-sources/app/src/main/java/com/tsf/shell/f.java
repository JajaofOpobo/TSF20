package com.tsf.shell;

import java.util.ArrayList;

/* loaded from: classes.dex */
final class f implements Runnable {
    final /* synthetic */ b a;
    private final /* synthetic */ ArrayList b;

    f(b bVar, ArrayList arrayList) {
        this.a = bVar;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar;
        gVar = this.a.f;
        gVar.a(this.b);
    }
}
