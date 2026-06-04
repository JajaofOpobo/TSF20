package com.tsf.shell;

import java.util.ArrayList;

/* loaded from: classes.dex */
final class c implements Runnable {
    final /* synthetic */ b a;
    private final /* synthetic */ ArrayList b;
    private final /* synthetic */ ArrayList c;

    c(b bVar, ArrayList arrayList, ArrayList arrayList2) {
        this.a = bVar;
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar;
        gVar = this.a.f;
        gVar.a(this.b, this.c);
    }
}
