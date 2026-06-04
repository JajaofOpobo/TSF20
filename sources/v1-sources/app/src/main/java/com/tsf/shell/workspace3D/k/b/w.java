package com.tsf.shell.workspace3D.k.b;

import java.util.ArrayList;

/* loaded from: classes.dex */
final class w implements Runnable {
    final /* synthetic */ k a;
    private final /* synthetic */ ArrayList b;
    private final /* synthetic */ boolean c;

    w(k kVar, ArrayList arrayList, boolean z) {
        this.a = kVar;
        this.b = arrayList;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar = this.a;
        ArrayList arrayList = this.b;
        boolean z = this.c;
        kVar.d(arrayList);
    }
}
