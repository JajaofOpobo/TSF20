package com.tsf.shell.workspace3D.h.a;

import java.util.Comparator;

/* loaded from: classes.dex */
final class c implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        com.tsf.shell.workspace3D.k.ah ahVar = (com.tsf.shell.workspace3D.k.ah) obj;
        com.tsf.shell.workspace3D.k.ah ahVar2 = (com.tsf.shell.workspace3D.k.ah) obj2;
        if (ahVar.ch().i > ahVar2.ch().i) {
            return -1;
        }
        return ahVar.ch().i < ahVar2.ch().i ? 1 : 0;
    }

    c() {
    }
}
