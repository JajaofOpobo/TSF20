package com.tsf.shell.action;

import java.util.ArrayList;

/* loaded from: classes.dex */
final class n implements Runnable {
    final /* synthetic */ m a;
    private final /* synthetic */ ArrayList b;

    n(m mVar, ArrayList arrayList) {
        this.a = mVar;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j.b.addAll(this.b);
        j.d.notifyDataSetChanged();
    }
}
