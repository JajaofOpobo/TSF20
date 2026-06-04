package com.tsf.shell;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class bg implements Runnable {
    private final /* synthetic */ int a;

    bg(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        arrayList = bd.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bj bjVar = (bj) it.next();
            int i = this.a;
            bjVar.p_();
        }
    }
}
