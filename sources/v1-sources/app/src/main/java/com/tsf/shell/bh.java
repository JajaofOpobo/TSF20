package com.tsf.shell;

import com.censivn.C3DEngine.api.message.RenderRunnable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class bh extends RenderRunnable {
    bh() {
        super(1, 1);
    }

    @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        int i;
        arrayList = bd.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bj bjVar = (bj) it.next();
            i = bd.a;
            bjVar.b(i);
        }
    }
}
