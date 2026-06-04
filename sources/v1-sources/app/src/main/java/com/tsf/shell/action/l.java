package com.tsf.shell.action;

import java.util.ArrayList;

/* loaded from: classes.dex */
final class l implements Runnable {
    final /* synthetic */ k a;
    private final /* synthetic */ ArrayList b;

    l(k kVar, ArrayList arrayList) {
        this.a = kVar;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j.a.addAll(this.b);
        j.e.notifyDataSetChanged();
    }
}
