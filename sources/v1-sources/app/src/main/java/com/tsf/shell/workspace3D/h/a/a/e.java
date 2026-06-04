package com.tsf.shell.workspace3D.h.a.a;

import com.censivn.C3DEngine.b.r;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class e implements Comparator {
    final /* synthetic */ a a;

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        r rVar = (r) obj;
        r rVar2 = (r) obj2;
        if (rVar.s() == null || rVar2.s() == null) {
            return 0;
        }
        float floatValue = ((Float) rVar.s()).floatValue();
        float floatValue2 = ((Float) rVar2.s()).floatValue();
        if (floatValue > floatValue2) {
            return -1;
        }
        return floatValue < floatValue2 ? 1 : 0;
    }

    public e(a aVar) {
        this.a = aVar;
    }
}
