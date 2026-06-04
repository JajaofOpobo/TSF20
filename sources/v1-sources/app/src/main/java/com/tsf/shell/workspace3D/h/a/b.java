package com.tsf.shell.workspace3D.h.a;

import java.text.Collator;
import java.util.Comparator;

/* loaded from: classes.dex */
final class b implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Collator collator;
        collator = a.e;
        return collator.compare(((com.tsf.shell.workspace3D.k.ah) obj).ch().a.toString(), ((com.tsf.shell.workspace3D.k.ah) obj2).ch().a.toString());
    }

    b() {
    }
}
