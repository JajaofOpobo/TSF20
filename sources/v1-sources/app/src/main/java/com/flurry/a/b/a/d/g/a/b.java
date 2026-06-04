package com.flurry.a.b.a.d.g.a;

import com.flurry.a.b.a.d.ac;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {
    private final c[] a;
    private final int b;

    public b(Map map) {
        int a = a(map.size());
        this.b = a;
        int i = a - 1;
        c[] cVarArr = new c[a];
        for (Map.Entry entry : map.entrySet()) {
            m mVar = (m) entry.getKey();
            int hashCode = mVar.hashCode() & i;
            cVarArr[hashCode] = new c(cVarArr[hashCode], mVar, (ac) entry.getValue());
        }
        this.a = cVarArr;
    }

    private static final int a(int i) {
        int i2 = 8;
        while (i2 < (i <= 64 ? i + i : (i >> 2) + i)) {
            i2 += i2;
        }
        return i2;
    }

    public final ac a(m mVar) {
        c cVar = this.a[mVar.hashCode() & (this.a.length - 1)];
        if (cVar == null) {
            return null;
        }
        if (mVar.equals(cVar.a)) {
            return cVar.b;
        }
        do {
            cVar = cVar.c;
            if (cVar == null) {
                return null;
            }
        } while (!mVar.equals(cVar.a));
        return cVar.b;
    }
}
